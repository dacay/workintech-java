package tr.workintech.courses.s14d1;

public abstract class Elma extends Fruit {

    public boolean isHasWorms() {
        return hasWorms;
    }

    public void setHasWorms(boolean hasWorms) {
        this.hasWorms = hasWorms;
    }

    private boolean hasWorms;

    @Override
    public double getSugarRate() {
        return 0.5;
    }
}
