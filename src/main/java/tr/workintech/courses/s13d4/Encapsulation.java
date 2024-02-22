package tr.workintech.courses.s13d4;

public class Encapsulation {

    private int age = 30; // -> Bu bir field

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 0)
            return;

        this.age = age;
    }

    public int getConsentfulAge() {

        return this.age < 18 ? 0 : this.age - 18;
    }

    public static void main(String[] args) {

        //        new Encapsulation().age; -> Java'da cok nadiren karsilasilacak bir tablo, obje ustunden direkt field erisimi
        new Encapsulation().setAge(10);
    }
}
