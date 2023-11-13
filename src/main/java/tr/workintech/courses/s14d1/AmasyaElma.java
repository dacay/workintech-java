package tr.workintech.courses.s14d1;

public class AmasyaElma extends Elma {

    public AmasyaElma() {

        super();
    }

    @Override
    public double getSugarRate() {
        return getSugarRate(false);
    }

    public double getSugarRate(boolean percent) {

        return percent ? 75 : 0.75;
    }
}
