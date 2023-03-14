import java.util.List;

;

public class Main {

    private static Jumpers skiTeam = new Jumpers();
    private static Jurors jurors = new Jurors();
    private static SkiJumper jumper = new SkiJumper();
    private static Beam beam = new Beam();
    private final int beamStart = 15;
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






