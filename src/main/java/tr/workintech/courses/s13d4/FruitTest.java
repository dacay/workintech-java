package tr.workintech.courses.s13d4;

public class FruitTest {

    public static void main(String[] args) {

        Fruit ilkMeyvem = Fruit.APPLE;

        ilkMeyvem = Fruit.PEAR;

        meyveninAdiniYazdir(ilkMeyvem);
    }

    private static void meyveninAdiniYazdir(Fruit fruit) {

        System.out.println("Meyvemin adi: " + fruit);
    }
}
