package tr.workintech.courses.s13d4;

public class ATest {

    public static void main(String[] args) {

        A.merhaba();

        System.out.println("y: " + A.y);

        A s1 = new A();
        s1.x = 5;

        A s2 = new A();
        s2.x = 7;

        System.out.println("x1 = " + s1.x);
        System.out.println("x2 = " + s2.x);
        System.out.println("paylasilan y = " + A.y);

        s1.hello();
    }
}
