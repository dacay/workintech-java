package tr.workintech.courses.s13d2;

import java.util.Locale;

public class StringMetodlari {

    public static void main(String[] args) {

        int x = 10;

        String s = "  Merhaba, iyiyiz bugün hava çok güzel.      ";

        String a = "Merhaba";
        String b = "Deniz";
        String c = a + b; // "Merhaba" + "Deniz"

        // Yukaridaki kod compile edildiginde asagidaki performansi daha iyi olana donuyor
        String sb = new StringBuilder().append(a).append(b).toString();

        // Java, ayni icerige sahip iki string icin farkli bellek yerleri tutmamaya calisiyor
        String d = "Deniz";

        System.out.println(s.trim()); // s.trim() gibi metodlar, yeni bir String dondurur, String'in ustunde degisiklik yok

        System.out.println(s.contains("bugün")); // s.contains(...), s stringi icinde verilen ifadenin gecip gecmedigini belirliyor

        System.out.println(s.equals("  Merhaba, iyiyiz bugün hava çok güzel.      "));

        System.out.println(s.toUpperCase(Locale.ENGLISH)); // genelde kullanirken locale ile dili belirtiriz
    }
}
