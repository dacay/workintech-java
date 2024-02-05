package tr.workintech.courses.s16d2;

public class HelloThread extends Thread {

    private final int number;

    public HelloThread(int number) {

        super();

        this.number = number;
    }

    @Override
    public void run() {

        System.out.println("Hello Workintech, this is thread number " + number + "! Time is " + System.currentTimeMillis() + " milliseconds.");
    }
}
