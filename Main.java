import dao.Jumpers;
import dao.SkiJumper;
import service.SkiService;

import java.util.List;

;

public class Main {

    private static Jumpers skiTeam = new Jumpers();
    private static SkiJumper jumper = new SkiJumper();
    private static SkiService skiService = new SkiService();


    public static void main(String[] args) {

        System.out.println("Welcome in our Ski Jumping Competition");
        System.out.println("jumpers of todays jumpersCompetition are : ");

        List<SkiJumper> jumperList = skiService.showListOfJumpers();
        for (SkiJumper skiJumper : jumperList) {
            System.out.println(skiJumper);

        }


        skiService.showResult();

    }





}






