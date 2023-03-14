import java.util.Comparator;

public class TestComparatorClass implements Comparator<ResultFinal> {


    @Override
    public int compare(ResultFinal o1, ResultFinal o2) {

        return Double.compare(o2.getResult(),o1.getResult());
    }
}
