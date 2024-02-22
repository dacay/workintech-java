package tr.workintech.courses.egzersiz;

public class Faktoriyel {

    public static void main(String[] args) {

        // Yol 1
        // 5! = 5.4.3.2.1
//        int n = 5;
//
//        int result = faktoriyel(5);
//
//        System.out.println(result);

        // Yol 2

        int result = faktoriyel2(5);

        System.out.println(result);
    }

    static int faktoriyel(int n) {

        if (n == 0)
            return 1;

        if (n == 1)
            return 1;

        int counter = 1;
        int result = 1;

        while(counter <= n) {

            result = result * counter;

            counter++;
        }

        return result;
    }

    static int faktoriyel2(int n) { // recursive func

        if (n == 0 || n == 1)
            return 1;

        return n * faktoriyel2(n-1);
    }
}
