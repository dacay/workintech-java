package tr.workintech.courses.s16d2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

    // HelloThread
//    public static void main(String[] args) throws InterruptedException {
//
//        System.out.println("Hello! Start time: " + System.currentTimeMillis());
//
//        HelloThread thread1 = new HelloThread(1);
//        HelloThread thread2 = new HelloThread(2);
//
//        thread1.start(); // Race condition?
//        thread2.start();
//
////        Thread.sleep(1000);
//
//        System.out.println("Threads start time: " + System.currentTimeMillis());
//    }

    // HelloRunnable
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello! Start time: " + System.currentTimeMillis());

        HelloRunnable runnable1 = new HelloRunnable(1);
        HelloRunnable runnable2 = new HelloRunnable(2);

        new Thread(runnable1).start();
        new Thread(runnable2).start();

        System.out.println("Threads start time: " + System.currentTimeMillis());
    }

//    // Executor?
//    public static void main(String[] args) {
//
//        System.out.println("Hello! Start time: " + System.currentTimeMillis());
//
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//
//        HelloRunnable runnable1 = new HelloRunnable(1);
//        HelloRunnable runnable2 = new HelloRunnable(2);
//
//        executorService.submit(runnable1);
//        executorService.submit(runnable2);
//
//        System.out.println("Threads start time: " + System.currentTimeMillis());
//
//        executorService.shutdown();
//    }
}
