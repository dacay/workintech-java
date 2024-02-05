package tr.workintech.courses.s16d2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tekrar {

    private static final String[] WORDS = new String[] {
            "absolute",
            "accommodations",
            "adapter",
            "agreed",
            "anaheim",
            "anywhere"
    };

    private static final ExecutorService EXECUTOR_SERVICE = Executors.newCachedThreadPool();

    public static class RastgeleSayi implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            return (int) (Math.random() * 100);
        }
    }

//    public static void main(String[] args) throws Exception {
//
//        Set<Integer> sayilar = new HashSet<>();
//
//        while (sayilar.size() != 10) {
//
//            sayilar.add(EXECUTOR_SERVICE.submit(new RastgeleSayi()).get());
//        }
//
//        System.out.println(sayilar);
//    }

    public static class StringBoyut implements Callable<Integer>{
        private String text;

        public StringBoyut(String text){
            this.text = text;
        }

        @Override
        public Integer call() throws Exception {
            return text.length();
        }
    }

    public static void main(String[] args) throws Exception {

        List<Callable<Integer>> callableKelimeler = new ArrayList<>();

        for(String word: WORDS){
            callableKelimeler.add(new StringBoyut(word));
        }


        EXECUTOR_SERVICE.invokeAll(callableKelimeler).forEach((sonuc)->{
            try {
                System.out.println(sonuc.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
