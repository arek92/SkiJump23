package service;

import dao.Jumpers;
import dao.SkiJumper;

import java.util.*;
import java.util.stream.Collectors;

public class SkiService {

    static Jumpers jumpersInCompetitions = new Jumpers();


    public static List<SkiJumper> showListOfJumpers() {
        List<SkiJumper> germanTeam = jumpersInCompetitions.jumpers();
        return germanTeam;
    }

    public static double jump(SkiJumper jumper){

        double resultOfJumper = jumper.resultOfJumpJurorsWindCondition();

        return resultOfJumper;
    }


    public static void showResult() {
        Map<Integer, ResultFinal> finalResultMap = new HashMap<>();
        List<SkiJumper> jumperList = jumpersInCompetitions.jumpers();
        int counter = 0;
        int jumperNumber = 0;

        for (SkiJumper skiJumper : jumperList) {

            System.out.println("The next jumper on the list is : " + jumperList.get(jumperNumber));
            double resultOfSingleJumper = jump(skiJumper);
            ResultFinal resultFinal = new ResultFinal(skiJumper,resultOfSingleJumper);
            counter++;
            jumperNumber++;
            finalResultMap.put(counter,resultFinal);
            Collection<ResultFinal> values = finalResultMap.values();
            List<ResultFinal> collect = values
                    .stream()
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println(collect);


        }

    }



}

