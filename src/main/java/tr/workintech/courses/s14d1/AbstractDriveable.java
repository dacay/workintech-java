package tr.workintech.courses.s14d1;

public abstract class AbstractDriveable implements Driveable {
    
    private boolean driving = false;

    @Override
    public void start() {

        this.driving = true;
    }

    @Override
    public void stop() {

        this.driving = false;
    }

    public boolean isDriving() {

        return this.driving;
    }

    public void setDriving(boolean driving) {

        this.driving = driving;
    }
}
