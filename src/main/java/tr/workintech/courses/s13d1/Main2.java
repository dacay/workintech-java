package tr.workintech.courses.s13d1;

import java.util.Scanner;

public class Main2 {

    /**
     * Main metodu
     * @param args Argumanlar
     */
    public static void main(String[] args) {

        System.out.println("Merhaba Java");

        boolean y = true;

        int x = 12; // int -> Integer -> tamsayi
        long x2 = 0L;

        String x3 = ""; // cift tirnak
        char c = 'c'; // tek tirnak

        float x4 = 0.257F;
        double x5 = 0.1334;

        aritmetikIslemler();
        akisIslemleri();
        donguIslemleri();
        scannerKullanimi();
    }

    private static void scannerKullanimi() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Yasin kac?");

        int i = sc.nextInt();

        System.out.println(i + " yasindasin!");
    }

    static void aritmetikIslemler() {

        double x = 3;
        double y = 7;

        System.out.println(x + y); // toplam
        System.out.println(x - y); // cikarma
        System.out.println(x * y); // carpma
        System.out.println(x / y); // bolme

        // iki integer ile yapilan bolme islemi sonucunda integer veriyordu. ancak integer tam sayi demek oldugu icin, en yakin tam sayiyi verdi, bizim icin bu 0'di
        // iki double ile yapilan aritmetik islemin sonucu double'dir

        System.out.println(x % 2 == 0); // x mod 2 = 0 demek

        x+=2;
        x-=2;
        x++;
        x--;
        ++x;
        --x;
    }

    static void akisIslemleri() {

        int x = 5;

        // if - else
        if (x % 2 != 0)
            System.out.println("Tek!"); // tek bir statement'lik icerik varsa, { } kaldirabiliriz
        else {

        }

        // bloklar halinde if-else
        if (x % 2 != 0) {
            System.out.println("Tek!");
        } else {

        }


        // Switch statement
        switch (x) {

            case 2:

                System.out.println("Iki!");
                break;

            case 3:

                System.out.println("Uc!");
                break;

            default:

                System.out.print("Sayi bulunamadi!\n\n");
        }
    }

    // Javadoc formati:
    /**
     * Dongu islemleri icin bir metod
     */
    private static void donguIslemleri() {

        String[] isimler = new String[] { "Deniz", "Ahmet", "Mehmet" }; // String array tanimlama

        // klasik for-i dongumuz
        for (int i = 0; i < 10; i++) {

            System.out.println(i);
        }

        // for-each dongusu
        for (String isim : isimler) {

            System.out.println("Isim: " + isim);
        }

        int j = 1;

        // while dongusu
        while (j<5) {

            System.out.println(j);
            j++;
        }

        j = 1;
        // do-while
        do {

            System.out.println(j);
            j++;

        } while(j<5);
    }
}
