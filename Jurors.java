
import java.util.ArrayList;
import java.util.List;

public class Jurors {


    Juror juror1 = new Juror(1, SkiJuror.FINLAND);
    Juror juror2 = new Juror(1, SkiJuror.SPAIN);
    Juror juror3 = new Juror(1, SkiJuror.KOREA_SOUTH);
    Juror juror4 = new Juror(1, SkiJuror.UKRAINE);
    Juror juror5 = new Juror(1, SkiJuror.USA);


    public List<Juror> jurors() {
        List<Juror> jurorList = new ArrayList<>();
        jurorList.add(juror1);
        jurorList.add(juror2);
        jurorList.add(juror3);
        jurorList.add(juror4);
        jurorList.add(juror5);

        return jurorList;
    }


}

