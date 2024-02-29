package tr.workintech.courses.s14d4;

public class ToggCar extends AbstractCar implements Runnable {

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void run() {

        this.start();
    }

    @Override
    public String toString() {

        return "ToggCar";
    }
}
