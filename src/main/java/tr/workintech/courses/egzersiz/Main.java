package tr.workintech.courses.egzersiz;

public class Main implements Addable {

    public static void main(String[] args) {
        
        // main metodundan cagrilacak, bir toplama islemi yapan fonksiyonu yazin
        // add(2,4);

        new Main().add(2,4);
    }

    @Override
    public int add(int x, int y) {

        return x + y;
    }
//
//    public static int add(int x, int y) {
//
//        return x+y;
//    }

    // bana bir interface yazsaniz, icinde add metodu olsun ve Main sinifi implement etsin.
}
