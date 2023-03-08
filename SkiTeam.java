

import java.util.ArrayList;
import java.util.List;

public class SkiTeam {

    public SkiTeam() {
    }

    private List<SkiJumper> jumperList;

    public SkiTeam(List<SkiJumper> jumperList) {
        this.jumperList = jumperList;
    }

    public List<SkiJumper> germanTeam() {
        List<SkiJumper> germanTeam = new ArrayList<>();
        germanTeam.add(new SkiJumper("Andreas", "Welinger"));
        germanTeam.add(new SkiJumper("Martin ", "Schmitt"));
        germanTeam.add(new SkiJumper("Markus", "Eichenbichler"));
        germanTeam.add(new SkiJumper("Sven", "Hanavald"));
        return germanTeam;
    }

    public List<SkiJumper> slovakiaTeam() {
        List<SkiJumper> slovakiaTeam = new ArrayList<>();
        slovakiaTeam.add(new SkiJumper("Andre", "Lanischek"));
        slovakiaTeam.add(new SkiJumper("Roman ", "Koudelka"));
        slovakiaTeam.add(new SkiJumper("Peter", "Prevc"));
        slovakiaTeam.add(new SkiJumper("Timi", "Zajc"));
        return slovakiaTeam;
    }

    public List<SkiJumper> austriaTeam() {
        List<SkiJumper> austriaTeam = new ArrayList<>();
        austriaTeam.add(new SkiJumper("Martin", "Hellwart"));
        austriaTeam.add(new SkiJumper("Stefan ", "Kraft"));
        austriaTeam.add(new SkiJumper("Gregor", "Schlierenzauer"));
        austriaTeam.add(new SkiJumper("Manuel", "Fettner"));
        return austriaTeam;
    }

    public List<SkiJumper> polandTeam() {
        List<SkiJumper> polandTeam = new ArrayList<>();
        polandTeam.add(new SkiJumper("Adam ", "Malysz"));
        polandTeam.add(new SkiJumper("Kamil ", "Stoch"));
        polandTeam.add(new SkiJumper("Piotr", "Zyla"));
        polandTeam.add(new SkiJumper("Aleksander", "Zniszczol"));
        return polandTeam;
    }

    public List<SkiJumper> norwayTeam() {
        List<SkiJumper> norwayTeam = new ArrayList<>();
        norwayTeam.add(new SkiJumper("Robert", "Johansonn"));
        norwayTeam.add(new SkiJumper("Marius ", "Lindvik"));
        norwayTeam.add(new SkiJumper("Halvor", "Granerud"));
        norwayTeam.add(new SkiJumper("Robin", "Pedersen"));
        return norwayTeam;
    }

    public List<SkiJumper> japanTeam() {
        List<SkiJumper> japanTeam = new ArrayList<>();
        japanTeam.add(new SkiJumper("hideharu", "mirahira"));
        japanTeam.add(new SkiJumper("Noriaki ", "Kasai"));
        japanTeam.add(new SkiJumper("Rioshu", "Nakamura"));
        japanTeam.add(new SkiJumper("Asahi", "Sakano"));
        return japanTeam;
    }
}

