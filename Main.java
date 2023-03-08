import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static SkiTeam skiTeam = new SkiTeam();
    private static Jurors jurors = new Jurors();
    private static SkiJumper jumper = new SkiJumper();
    private static Beam beam = new Beam();
    private final int beamStart = 15;


    public static void main(String[] args) {


        List<SkiJumper>jumperList = new ArrayList<>();
        jumperList.add(new SkiJumper("Kamil","Stoch"));
        jumperList.add(new SkiJumper("Adam","Małysz"));

        for (SkiJumper skiJumper : jumperList) {
            double resultOfSingleJumper = competition(skiJumper);
            System.out.println("Jumper is : " + skiJumper + " " + " his result is : " + " " + resultOfSingleJumper);

        }




    }

    public static double competition(SkiJumper jumper){
        double resultOfJumper = jumper.resultOfJumpJurorsWindCondition();

        return resultOfJumper;
    }



}




