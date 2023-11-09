package tr.workintech.courses.s13d4;

public class Encapsulation {

    private int age = 30; // -> Bu bir field

    int getAge() {

        return this.age;
    } // getter

    void setAge(int newAge) {

        if (newAge > 0)
            this.age = newAge;
    } // setter

    // Farkli islem yaparak donen bir getter
    int getConsentfulAge() { // Resit yas

        return this.age - 18;
    }
}
