package tr.workintech.courses.egzersiz;

public class Fibonacci {

    // Fibonacci
    // 1 1 2 3 5 8 13 21 34

    public static void main(String[] args) {

        int result = fibonacci(3);

        System.out.println(result);
    }

    private static int fibonacci(int n) {

        if (n <=1)
            return n;

        return fibonacci(n-1) + fibonacci(n-2);
    }

//    Site Reliability Engineering (SRE)
}
