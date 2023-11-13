package tr.workintech.courses.s14d1;

public class Main {

    private static Driveable[] CARS = new Driveable[10];

    public static void main(String[] args) {

        // Driveable
        // AbstractDriverable
        // Concrete implementation -> Spesifik implementasyonumuz var, implement etmek -> var olan bir metodu doldurmak gibi dusunebiliriz, bir cozumu yerine getirmek

        Driveable driveableA = new Togg();

        AbstractDriveable abstractDriveableA = (AbstractDriveable) driveableA;

        Togg toggA = (Togg) abstractDriveableA;

        toggA.start();

        storeCar(toggA, 0);

        // Meyve ornegi
        Fruit fruit = new AmasyaElma();

        fruit.getSugarRate();

        Elma amasyaElma = (AmasyaElma) fruit;

        ((AmasyaElma) fruit).isHasWorms();
    }

    public static void storeCar(Driveable driveable, int index) {

        CARS[index] = driveable;
    }
}