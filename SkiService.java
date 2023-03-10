import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SkiService {

    static Jumpers skiTeam = new Jumpers();

    public static void showListOfJumpers() {
        Map<Integer, SkiJumper> jumperMap= new HashMap<>();
        List<SkiJumper> germanTeam = skiTeam.jumpers();
        jumperMap.put(1,germanTeam.get(0));
        jumperMap.put(2,germanTeam.get(1));
        jumperMap.put(3,germanTeam.get(2));
        jumperMap.put(4,germanTeam.get(3));


        Set<Map.Entry<Integer, SkiJumper>> entries = jumperMap.entrySet();
        for (Map.Entry<Integer, SkiJumper> entry : entries) {
            System.out.println(entry.getKey() + " "  + entry.getValue());


        }


    }

    public static double jump(SkiJumper jumper){

        double resultOfJumper = jumper.resultOfJumpJurorsWindCondition();

        return resultOfJumper;
    }


    public static Map<Integer, String> showResult() {
        Map<Integer, String> finalResultMap = new HashMap<>();
        List<SkiJumper> jumperList = skiTeam.jumpers();
        int counter = 0;
        int jumperNumber = 0;

        for (SkiJumper skiJumper : jumperList) {

            System.out.println("The next jumper on the list is : " + jumperList.get(jumperNumber));
            double resultOfSingleJumper = jump(skiJumper);
            counter++;
            jumperNumber++;
            String result = "" + skiJumper + " " + "  " + " " + resultOfSingleJumper;
            finalResultMap.put(counter, result);

        }





        return finalResultMap;
    }
}
