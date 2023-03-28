package service;

import dao.SkiJumper;

public class ResultFinal implements Comparable {

    private SkiJumper jumper;
    private double result;

    public SkiJumper getJumper() {
        return jumper;
    }

    public void setJumper(SkiJumper jumper) {
        this.jumper = jumper;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public ResultFinal(SkiJumper jumper, double result) {
        this.jumper = jumper;
        this.result = result;
    }

    public ResultFinal() {
    }

    @Override
    public String toString() {
        return "service.ResultFinal{" +
                "jumper=" + jumper +
                ", result=" + result +
                '}';
    }


    @Override
    public int compareTo(Object o) {

        return Double.compare(((ResultFinal)o).getResult(),this.getResult());
    }
}
