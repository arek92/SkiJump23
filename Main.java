import java.util.*;

public class Main {

    private static SkiTeam skiTeam = new SkiTeam();
    private static Jurors jurors = new Jurors();
    private static SkiJumper jumper = new SkiJumper();
    private static Beam beam = new Beam();
    private final int beamStart = 15;


    public static void main(String[] args) {

        System.out.println("Welcome in our Ski Jumping Competition");

        showListOfJumpers();

        System.out.println(mapResult());

    }


    private static void showListOfJumpers() {
        Map<Integer,SkiJumper> jumperList= new HashMap<>();
        List<SkiJumper>germanTeam = skiTeam.germanTeam();
        jumperList.put(1,germanTeam.get(0));
        jumperList.put(2,germanTeam.get(1));
        jumperList.put(3,germanTeam.get(2));
        jumperList.put(4,germanTeam.get(3));


        Set<Map.Entry<Integer, SkiJumper>> entries = jumperList.entrySet();
        for (Map.Entry<Integer, SkiJumper> entry : entries) {
            System.out.println(entry.getKey() + " "  + entry.getValue());


        }


    }

    public static double competition (SkiJumper jumper){
        double resultOfJumper = jumper.resultOfJumpJurorsWindCondition();

        return resultOfJumper;
    }


    public static Map<Integer, String> mapResult() {
        Map<Integer, String> finalResultMap = new HashMap<>();
        List<SkiJumper> jumperList = skiTeam.germanTeam();
        int counter = 0;

        for (SkiJumper skiJumper : jumperList) {

            double resultOfSingleJumper = competition(skiJumper);
            counter++;
            String result = "" + skiJumper + " " + "  " + " " + resultOfSingleJumper;
            finalResultMap.put(counter, result);

        }





        return finalResultMap;
    }
}






