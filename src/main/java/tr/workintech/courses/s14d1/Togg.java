package tr.workintech.courses.s14d1;

public class Togg extends AbstractDriveable {

    private String state;

    @Override
    public void turnOnInnerLights() {

        // this -> icinde bulundugumuz bu sinif
        // super -> ust sinif/tip

        super.stop();
    }

    @Override
    public void start() {

        this.state = "starting";
    }
}
