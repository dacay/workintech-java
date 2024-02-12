package tr.workintech.courses.egzersiz;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class DosyaIslemleri {

    private static String dosya = "/Users/deniz/Projects/Workintech/workintech-java/content.txt";

    public static void main(String[] args) throws Exception {

        if (!Files.exists(Path.of(dosya))) {

            System.out.println("Dosyaya erisilemiyor.");
        } else {

            System.out.println("Dosya bulundu.");
        }

        String dosyaIcerigi = dosyaOku();

        System.out.println(dosyaIcerigi);

        // Kac cumle oldugunu sayan bir kod yazin
        int cumleSayisi = kacCumle(dosyaIcerigi);

        System.out.println("Cumle sayisi: " + cumleSayisi);
    }

    private static int kacCumle(String str) {
        //TODO
    }

    private static String dosyaOku() throws IOException {

        File targetFile = new File(dosya);

        // 1. yontem - BufferedReader

//        BufferedReader bufferedReader = new BufferedReader(new FileReader(targetFile));
//
//        StringBuilder tumIcerik = new StringBuilder();
//
//        String st;
//
//        while((st = bufferedReader.readLine()) != null) { // null gelene kadar oku demek
//
//            System.out.println(st);
//
//            tumIcerik.append(st);
//        }
//
//        return tumIcerik.toString();

        // 2. yontem -> Scanner

        Scanner sc = new Scanner(targetFile);

        StringBuilder tumIcerik = new StringBuilder();

        while(sc.hasNextLine())
            tumIcerik.append(sc.nextLine());

        return tumIcerik.toString();

        // 3. yontem

//        return Files.readString(Path.of(dosya));
    }
}
