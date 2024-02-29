package tr.workintech.courses.s14d4;

public class Main {

    public static void main(String[] args) {

        Car car = new ToggCar();
        car.start();

        // Car car = CarFactory.getCar("Togg");

        Runnable runnable = new ToggCar();

        AbstractCar car2 = new ToggCar();

        // Car > AbstractCar > ToggCar (hiyerarsi)

//        ElectricCar car3 = new ToggCar();
        // Bu olmuyor ancak ElectricCar'i da ToggCar sinifinda implement edersek, oluyor. Ancak diger sartlarda, arada
        // bir baglanti yok
    }
}
