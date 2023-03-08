
import java.text.DecimalFormat;
import java.util.*;

public class Main {

    private static SkiTeam skiTeam = new SkiTeam();
    private static Jurors jurors = new Jurors();
    private static Service service = new Service();


    public static void main(String[] args) {

        double finalNoteOfJumper = service.jumpAndGetScoreOfSingleJump();
        System.out.println(finalNoteOfJumper);



    }

}




