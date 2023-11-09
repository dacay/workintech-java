package tr.workintech.courses.s13d4;

public class EncapsulationTest {

    public static void main(String[] args) {

        Encapsulation e = new Encapsulation();

        int firstAge = e.getAge();

        e.setAge(-100);

        int secondAge = e.getAge();

        e.setAge(40);

        int thirdAge = e.getAge();

    }
}
