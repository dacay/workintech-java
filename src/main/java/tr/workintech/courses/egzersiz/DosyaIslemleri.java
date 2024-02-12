package tr.workintech.courses.egzersiz;

import java.nio.file.Files;
import java.nio.file.Path;

public class DosyaIslemleri {

    private static String dosya = "";

    public static void main(String[] args) {

        if (!Files.exists(Path.of(dosya))) {

            System.out.println("Dosyaya erisilemiyor.");
        }
    }
}
