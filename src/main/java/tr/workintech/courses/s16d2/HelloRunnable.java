package tr.workintech.courses.s16d2;

public class HelloRunnable implements Runnable {

    private final int number;

    public HelloRunnable(int number) {

        this.number= number;
    }

    @Override
    public void run() {

        System.out.println("Hello Workintech, this is thread number " + number + "! Time is " + System.currentTimeMillis() + " milliseconds.");
//        System.out.println(Thread.currentThread().getName() + ", ID=" + Thread.currentThread().getId());
    }
}
