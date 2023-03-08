import java.util.List;

public class Main {

    private static SkiTeam skiTeam = new SkiTeam();
    private static Jurors jurors = new Jurors();
    private static Service service = new Service();


    public static void main(String[] args) {

       // double finalNoteOfJumper = service.resultOfJumpJurorsWindCondition();
       // System.out.println(finalNoteOfJumper); //jump + juror + wind

//        SkiJumper jumper = new SkiJumper("Adam","Małysz",service.resultOfJumpJurorsWindCondition());
//        System.out.println(jumper);

        List<SkiJumper> germanTeam = skiTeam.germanTeam();
        System.out.println(germanTeam);




    }

}




