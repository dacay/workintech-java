package tr.workintech.courses.s13d4;

public class Statik {

    public static final String A = "123";
    private static final String helperStr = "1234567";
//    private static final Logger LOGGER = ...

    public static void main(String[] args) {

        Statik s = new Statik(); // s -> instance of Statik
        System.out.println(Statik.class.isInstance(s));

        s.hello();

//        Statik.A; -> var
//        s.A; -> yok

        Calculator.add(3,5);

        double x = Math.PI * 2;

    }

    public void hello() {

        System.out.println("Hello!");
    }
}
