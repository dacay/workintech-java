package tr.workintech.courses.s15d1;

import java.util.ArrayList;
import java.util.List;

public class BoxingUnboxing {

    public static void main(String[] args) {

        // List<int> yasListesi;

        // Primitive tip yerine kullanilabilen siniflarimiz
        // Integer (int yerine)
        // Long (long yerine)
        // Short (short yerine)
        // Byte (byte yerine)
        // Float (float yerine)
        // Double (double yerine)
        // Boolean (bool yerine)

        // Java'da dumduz yazilan rakamlar primitive sayilir

        int ilkSayi = 100;

        List<Integer> yasListesi = new ArrayList<>();
        yasListesi.add(ilkSayi); // Bu sihire, biz boxing diyoruz
        // primitive int tipindeki degiskeni alip Integer'a cevirdi = Boxing

        int ilkEleman = yasListesi.get(0); // Bu da unboxing
        // boxlanmis sinif tipindeki degiskeni alip privimitive'e cevirme = Unboxing

        // Boxing ve Unboxing -> Otomatik yaptigi seyler

        boolean x = true;
        Boolean boxedX = x;
    }
}
