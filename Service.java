

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Scanner;

public class Service {

    private static Jurors jurors = new Jurors();
    private static final int beamHigh = 5;
    private static Service service = new Service();




    public static double jumpAndGetScoreOfSingleJump() {
        double noteForJumpLenght = service.provideLenghtOfJumpAndCountNote();
        double noteForStyle = service.rateJumpByJurors();
        double pointsForJumpLenghtAndStyle = noteForJumpLenght + noteForStyle;
        System.out.println("Points to save from JumpLenght and JurorsStyle are : " + " " + pointsForJumpLenghtAndStyle);
        double finalNoteOfJumper = service.getPointsFromJumpStyleWindAndBeam(pointsForJumpLenghtAndStyle);
        return finalNoteOfJumper;


    }

    public static double countNoteForWindConditions(double forceWindms) {
        double noteForWindFinal = 5.00;
        System.out.println("1 m/s = 5.00 points of note");
        double noteForWindCondition = noteForWindFinal * forceWindms;

        return noteForWindCondition;
    }

    public static double getPointsFromJumpStyleWindAndBeam(double pointsForJumpLenghtAndStyle) {
        Scanner scanner = new Scanner(System.in);
        String windStatus;
        System.out.println("Wind conditions were good or bad ");
        windStatus = scanner.next();
        System.out.println("Give force of wind in as number from 1-10 where 10 = 1m/s");
        int forceWind;
        forceWind = scanner.nextInt();
        double forceWindDouble = forceWind / 10.0;
        double noteForWindCondition = countNoteForWindConditions(forceWindDouble);
        if (windStatus.equals("good")) {
            double noteAfterCheckingWindCondition = pointsForJumpLenghtAndStyle - noteForWindCondition;
            System.out.println("we have to subtract points for wind in case of good Conditions and note of jumper is : " + " " + noteAfterCheckingWindCondition);
            double result = checkBeam(noteAfterCheckingWindCondition);
            return result;

        } else {
            double noteAfterCheckingWindCondition = pointsForJumpLenghtAndStyle + noteForWindCondition;
            System.out.println("we have to add points for wind in case of bad Conditions and note of jumper is " + " " + noteAfterCheckingWindCondition);
            double result1 = checkBeam(noteAfterCheckingWindCondition);
            return result1;
        }

    }


    public static double checkBeam(double noteAfterCheckingWindCondition) {
        Scanner scanner = new Scanner(System.in);
            int numberOfBeam;
            String downUp;
            System.out.println(" beam was going up or down? - (up/down)");
            downUp = scanner.next();
            if (downUp.equals("up")) {
                System.out.println("How beam was goin up ? give number");
                numberOfBeam = scanner.nextInt();
                int pointsGivenForBeam = numberOfBeam * beamHigh;
                double pointsGivenForBeam1 = pointsGivenForBeam;
                double result1 = noteAfterCheckingWindCondition - pointsGivenForBeam;
                System.out.println("The Jumper jumped from higher Beam so " + pointsGivenForBeam + " must be subtracked to his note " + " " + "so his final note is: " +
                        result1);
                return result1;
            } else {
                System.out.println("How beam was goin down ? give number");
                numberOfBeam = scanner.nextInt();
                int pointsGivenForBeam = numberOfBeam * beamHigh;
                double pointsGivenForBeam1 = pointsGivenForBeam;
                double result2 = noteAfterCheckingWindCondition + pointsGivenForBeam;
                System.out.println("The Jumper jumped from lower Beam so " + pointsGivenForBeam + " must be added to his note " + " " + "so his final note is: " +
                        result2);
                return result2;

            }

        }



    public static double provideLenghtOfJumpAndCountNote() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give lenght of Jumper");
        double lengthOfJump;
        lengthOfJump = scanner.nextDouble();
        double rateForLenght = countNoteForJumpOfJumperLenght(lengthOfJump);

        return rateForLenght;
    }

    public static double countNoteForJumpOfJumperLenght(double jumpLenght) {
        System.out.println("jumpLenght of Jumper is " + jumpLenght);
        System.out.println("Points to save for jumplenght = " + " " + jumpLenght / 2);
        double pointsForJumpLenght = jumpLenght / 2;
        ;
        return pointsForJumpLenght;
    }

    public static List<Juror> showListOfJurors() {
        List<Juror> jurors = new ArrayList<>();
        jurors.add(new Juror(1, SkiJuror.SPAIN));
        jurors.add(new Juror(2, SkiJuror.KOREA_SOUTH));
        jurors.add(new Juror(3, SkiJuror.USA));
        jurors.add(new Juror(4, SkiJuror.UKRAINE));
        jurors.add(new Juror(5, SkiJuror.FINLAND));
        return jurors;
    }


    public static List<Double> listOfJurorsNotes(double points1, double points2, double points3, double points4, double points5) {
        double note1 = jurors.juror1.setNoteForJump(points1);
        double note2 = jurors.juror2.setNoteForJump(points2);
        double note3 = jurors.juror3.setNoteForJump(points3);
        double note4 = jurors.juror4.setNoteForJump(points4);
        double note5 = jurors.juror5.setNoteForJump(points5);
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

