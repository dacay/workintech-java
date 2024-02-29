package tr.workintech.courses.s14d4;

public abstract class AbstractCar implements Car {

    // Interface, Abstract class => new ile yeni obje olusturulamiyor. O sebeple bunlara genel olarak soyut turler diyebiliriz
    // Bu turlerin gercek implementasyonlarina (sartlarinin yerine getirildigi tipler, siniflar) concrete class deniyor.
    // Burada hiyerarsik siralama (soyuttan somuta): Interface > Abstract class > (Concrete) Class

    private int kmsPerHour = 0;
    private short gear = 0;

    @Override
    public int getKmsPerHour() {

        return kmsPerHour;
    }

    protected void setKmsPerHour(int v) {

        this.kmsPerHour = v;
    }

    @Override
    public short getGear() {

        return gear;
    }

    public void setGear(short gear) {

        this.gear = gear;
    }
}
