package tr.workintech.courses.s13d2;

import com.google.common.primitives.Floats;

public class TipDonusumleri {

    public static void main(String[] args) {

        // tip donusumu?

        int x = 10;
        long y = x;
        short z = (short) x; // tip cevirme syntax,
        // daha kucuk bir degiskene sigdirmaya calisiyorsak, sigacagindan emin olmamiz lazim
        byte a = (byte) x;

        float b = 0.123F;
        double c = b;
        float d = (float) c;

        String t = "Merhaba";
        char[] u = t.toCharArray();

        // Herhangi bir seyi string ile birlestirirsek (+ ile mesela) o objenin .toString metodu cagirilir ve string'e eklenir

        System.out.print("Benim boyum: " + 188);

        Boolean.toString(false);
        Integer.toString(x);
        Integer.parseInt("123");
        Short.toString((short) 1);
        Float.toString(d);
        new App().toString(); // -> Objeyi string'e cevirme

        // eger bir obje String'e donebiliyorsa, toString metodunu implement edebiliriz

        Floats.max(d, 0.2F); // Floats gibi pek cok yardimci sinif Guava'da var
        // Istedigimiz kadar kutuphane (dependency - bagimlilik) ekleyebiliriz
    }

    @Override
    public String toString() {

        return "TipDonusumleri";
    }

    public App fromString(String x) {
        return null;
    }
}
