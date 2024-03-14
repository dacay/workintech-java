package tr.workintech.courses.s15d4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threads {

    private static final ExecutorService EXECUTOR_SERVICE = Executors.newCachedThreadPool();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {

            System.out.println("Thread 1'den selamlar!");

            //...
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Thread 1 gorevini bitirdi.");
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("Thread 2'den selamlar!");

                //...
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("Thread 2 gorevini bitirdi.");
            }
        });

        t1.start();
        t2.start();

        EXECUTOR_SERVICE.submit(new Runnable() {
            @Override
            public void run() {

                System.out.println("Thread 3'den selamlar!");

                System.out.println("Thread 3 gorevini bitirdi.");
            }
        });

        // Multi-threading -> Birden fazla thread kullanimi
    }
}
