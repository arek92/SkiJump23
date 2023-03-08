import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static SkiTeam skiTeam = new SkiTeam();
    private static Jurors jurors = new Jurors();
    private static Service service = new Service();
    private static SkiJumper jumper = new SkiJumper();
    private static Beam beam = new Beam();
    private final int beamStart = 15;


    public static void main(String[] args) {

        double resultOfJump = service.resultOfJumpJurorsWindCondition();
        /**
         * ustawiamy belke zawodow na 15
         * pierwszy skoczek skoczy z 15 belki
         * pozostały przed skokiem musi byc pytany co robimy z belka czy zostaje czy jakas zmiana
         * w zależnosci od tego dodaj pkt za belke
         *
         */

        SkiJumper jumper1 = new SkiJumper("Adam","Małysz",resultOfJump);

        System.out.println(jumper1);
        double resultOfJumper1 = jumper1.getResultOfJump();


        List<Double>listOfResult = new ArrayList<>();
        listOfResult.add(resultOfJumper1);

        for (Double aDouble : listOfResult) {
            System.out.println(aDouble);

        }

        /**
         * jaki jest cel? wez z listy nowego skoczka
         * niech skoczy
         * wyswietl resultat
         * wyciagni getterem
         */







    }



}




