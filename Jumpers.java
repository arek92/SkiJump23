

import java.util.ArrayList;
import java.util.List;

public class Jumpers {


    public List<SkiJumper> jumpers() {
        List<SkiJumper> jumperList = new ArrayList<>();
        jumperList.add(new SkiJumper("Janne", "Achonen",Nationality.FINLAND));
        jumperList.add(new SkiJumper("Adam  ", "Małysz",Nationality.POLAND));
        jumperList.add(new SkiJumper("Noriaki", "Kasai",Nationality.JAPAN));
       // jumperList.add(new SkiJumper("Gregor","Schlierenzauer",Nationality.AUSTRIA));
        return jumperList;
    }


}

