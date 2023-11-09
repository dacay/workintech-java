package tr.workintech.courses.s13d1;

import java.util.Scanner;

/**
 * Programimin ana sinifi.
 */
public class Main {

    /**
     * Ana metod.
     * @param args Argumanlar
     */
    public static void main(String[] args) {

        final int abc = 10;

        int sayi = 123456;
        double ondalikSayi = 12.345;
        boolean dogruMu = true;
        byte x = 120;
        char c = 'a';
        char c2 = 97;

        String name = "Deniz";

        sayi = 2 + 3;
        sayi += 2;
        sayi++;
        sayi--;

        name = name + sayi;
        name += dogruMu;
        ondalikSayi += sayi;

        // Type casting - degisken tipini cevirme
        int p = (int) 123000000000000230L;

        if (p < 10) {
            //...
        } else if (p < 5) {
            //...
        } else {
            //...
        }

        switch (x) {

            case 1:
                break;

            default:
                break;
        }

        for (int i = 0; i < 10; i++) {

        }

        int[] sayilar = {1, 3, 4, 5, 6, 7, 8, 9};

        for (int no : sayilar) {

            System.out.println(no);
        }

        int i = 3;
        while (i < 5) {

            i++;
        }

        do {
            // ,,,
        } while (i < 5);

        // Scanner kullanimi

        Scanner sc = new Scanner(System.in);

        System.out.println("Yasin kac?");

        int age = sc.nextInt();

        System.out.println("You are " +  age + " years old.");

//        sc.next();

        // Equality
        // Primitive tiplerde == ve != gibi ifadeler calisiyor
        // Objelerde, .equals metodu kullanilmali

        // Java'da iki objeyi == ile karsilastirirsaniz, iki objenin ayni olup olmadigini kontrol eder (bellekte ayni yerde mi duruyorlar diye)
        String s1 = "Deniz";
        String s2 = "Deniz";

        // s1 == s2
        // Burada s1 ve s2'nin bellekteki adresleri karsilastirilacak, biz bunu istemiyoruz

        // s1.equals(s2)
        // Degerleri esit mi diye bakiyor.

        s1.equals(x);
        // x string degil, o sebeple daha cabuk cevap aliriz.
        // equals => tipleri ayni ve degerleri de ayni

        // .equals metodu, primitive degiskenlerde yok

        int a = 10;
        float b = 10.1F;

        System.out.println(a == b);

        // yorum
        /*
        yorum
         */
    }
}
