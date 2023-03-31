package dao;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Scanner;



public class SkiJumper {

        private String firstName;
        private String lastName;
        private Nationality nationality;


    public SkiJumper() {
    }

    public SkiJumper(String firstName, String lastName, Nationality nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;

    }


    @Override
    public String toString() {
        return "dao.SkiJumper{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationality=" + nationality +
                '}';
    }


    public static double  provideLenghtOfJumpAndCountNote() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give lenght of Jumper");
        double lengthOfJump;
        lengthOfJump = scanner.nextDouble();
        if (lengthOfJump==0.0 || lengthOfJump<0){
            throw new IllegalArgumentException("LengthJump must be higher as 0");
        }
        System.out.println("jumpLenght of Jumper is " + lengthOfJump);

         lengthOfJump = lengthOfJump/2;
        System.out.println("Points to save from jumpLenght = " + " " + lengthOfJump);

        return lengthOfJump;
    }

    public static double resultOfJumpJurorsWindCondition() {
        double noteForJumpLenght = provideLenghtOfJumpAndCountNote();
        double noteForStyle = rateJumpByJurors();
        double pointsForJumpLenghtAndStyle = noteForJumpLenght + noteForStyle;
        System.out.println("Points to save from JumpLenght and JurorsStyle are : " + " " + pointsForJumpLenghtAndStyle);
        double finalNoteOfJumper =JumpStyleWindCountResult(pointsForJumpLenghtAndStyle);
        return finalNoteOfJumper;


    }


    public static double JumpStyleWindCountResult(double pointsForJumpLenghtAndStyle) {
        Scanner scanner = new Scanner(System.in);
        String windStatus;
        final double windPoint = 5.00;
        do {
            System.out.println("Wind conditions were good or bad ");
            windStatus = scanner.next();
            if (windStatus.equals("good") || windStatus.equals("bad")) {
                continue;
            }

            System.err.println("please input good or bad ");

        }
        while (!windStatus.equals("good") && !windStatus.equals("bad"));

        int forceWind;
        do {

            System.out.println("Give force of wind in as number from 1-10 where 10 = 1m/s");

            forceWind = scanner.nextInt();
            if (forceWind > 0) {
                continue;
            }
            System.err.println("force wind must be higher than zero please input correct value");

        } while(!(forceWind >0));

        double forceWindDouble = forceWind / 10.0;
        double noteForWindCondition = forceWindDouble * windPoint;
        if (windStatus.equals("good")) {
            double noteAfterCheckingWindCondition = pointsForJumpLenghtAndStyle - noteForWindCondition;
            System.out.println("we have to subtract points for wind in case of good Conditions and final note of jumper is : " + " " + noteAfterCheckingWindCondition);
            return noteAfterCheckingWindCondition;

        } else {
            double noteAfterCheckingWindCondition = pointsForJumpLenghtAndStyle + noteForWindCondition;
            System.out.println("we have to add points for wind in case of bad Conditions and final note of jumper is " + " " + noteAfterCheckingWindCondition);
            return noteAfterCheckingWindCondition;
        }

    }



    //tested
    public static List<Juror> showListOfJurors() {
        List<Juror> jurors = new ArrayList<>();
        jurors.add(new Juror(1, SkiJuror.SPAIN));
        jurors.add(new Juror(2, SkiJuror.KOREA_SOUTH));
        jurors.add(new Juror(3, SkiJuror.USA));
        jurors.add(new Juror(4, SkiJuror.UKRAINE));
        jurors.add(new Juror(5, SkiJuror.FINLAND));
        return jurors;
    }



    //tested
    public static List<Double> listOfJurorsNotes(double points1, double points2, double points3, double points4, double points5) {
        List<Juror>jurorList = showListOfJurors();
        double note1 = jurorList.get(0).setNoteForJump(points1);
        double note2 = jurorList.get(1).setNoteForJump(points2);
        double note3 = jurorList.get(2).setNoteForJump(points3);
        double note4 = jurorList.get(3).setNoteForJump(points4);
        double note5 = jurorList.get(4).setNoteForJump(points5);
        List<Double> notesList = new ArrayList<>();
        notesList.add(note1);
        notesList.add(note2);
        notesList.add(note3);
        notesList.add(note4);
        notesList.add(note5);

        return notesList;
    }

    public static double rateJumpByJurors() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Jurors which will rate the jumps ");
        System.out.println(showListOfJurors());
        List<Juror> jurors = showListOfJurors();
        System.out.println(jurors.get(0));
        System.out.println("Give first rate");
        double rate1;
        rate1 = scanner.nextDouble();
        System.out.println(jurors.get(1));
        System.out.println("Give second rate");
        double rate2;
        rate2 = scanner.nextDouble();
        System.out.println(jurors.get(2));
        System.out.println("Give 3th rate");
        double rate3;
        rate3 = scanner.nextDouble();
        System.out.println(jurors.get(3));
        System.out.println("Give 4th rate");
        double rate4;
        rate4 = scanner.nextDouble();
        System.out.println(jurors.get(4));
        System.out.println("Give 5th rate");
        double rate5;
        rate5 = scanner.nextDouble();
        List<Double> ratesList = listOfJurorsNotes(rate1, rate2, rate3, rate4, rate5);
        System.out.println(ratesList);
        DoubleSummaryStatistics doubleSummaryStatistics = ratesList.stream().mapToDouble((x) -> x).summaryStatistics();
        double noteMax = doubleSummaryStatistics.getMax();
        double noteMin = doubleSummaryStatistics.getMin();
        ratesList.remove(noteMax);
        ratesList.remove(noteMin);
        double note1ToSave = ratesList.get(0);
        double note2ToSave = ratesList.get(1);
        double note3ToSave = ratesList.get(2);
        double sumNotesForStyle = note1ToSave + note2ToSave + note3ToSave;
        System.out.println("Points to save from Jurors are : " + " " + sumNotesForStyle);
        System.out.println("*************************");


        return sumNotesForStyle;
    }
}


