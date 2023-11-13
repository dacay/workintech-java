package tr.workintech.courses.s14d1;

/*
 * Surulebilen araclari temsil eden bir arayuz.
 */
public interface Driveable {

    public static final float IGNITION_FACTOR = 1.4566F;
//    static final float ATESLEME_KATSAYISI = 1.4566F; <--- bir sey yazmadiginda yine public sayiliyor
  
    // Interface -> Objelerin sadece davranisini gosterir (sinifta var olacak method ve sabitleri icerir)
    // Tek basina kullanilamaz, daha ziyade kullanacak sinifin bazi ozellikleri tasimasi gerektigini ifade eder
    // https://www.infoworld.com/article/2076841/designing-with-interfaces.html

    // Bu bir abstract / soyut method, body'si yok, sadece adi ve tipleriyle argumanlar var
    // Interface'lerdeki her bir eleman (field, method, vs) public olmak zorundadir.

    public void start();
    // void basla(); <-- ayni anlama geliyor, otomatik olarak public sayiliyor

    public void stop();

    // Interface'ler bos oldugu icin (siniflara ek ozellik katmiyorlar), genelde static final olarak sabitler konabilir, tekil degisken koymuyoruz
    // public int a = 10;

    public void turnOnInnerLights();
}
