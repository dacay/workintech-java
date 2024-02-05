package tr.workintech.courses.s16d1;

import java.util.*;

public class Tekrar {

    private static final String yazi = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

    public static void main(String[] args) {

//        int kelimeSayisi = kelimeSayma();
//
//        System.out.println("Kelime sayisi: " + kelimeSayisi);

//        kelimeKelimeSayma();

//        kelimeBoyutunaGoreSayma();

        kelimeBoyutunaGoreGruplama();
    }

    public static int kelimeSayma() {

        // yazidaki kelimeleri sayin. bosluk, virgul ve nokta yok sayilacak
        // en fazla O(n) olsun karmasikligi

        String[] words = yazi.replaceAll("[,.]", "").split(" ");

        return words.length;
    }

    public static void kelimeKelimeSayma() {

        // yazidaki kelimeleri tek tek sayin, hangi kelimedn kac tane oldugunu gorebilmemiz lazim. kucuk buyuk harf ayri sayilsin. bosluk, virgul ve nokta yok sayilacak
        // en fazla O(n) olsun karmasikligi

        String[] words = yazi.replaceAll("[,.]", "").split(" ");

        Map<String, Integer> kelimeCount = new HashMap<>();

        for (String word : words) {

            if (kelimeCount.containsKey(word))
                kelimeCount.put(word, kelimeCount.get(word) + 1);
            else
                kelimeCount.put(word, 1);
        }

        kelimeCount.entrySet().forEach(stringIntegerEntry -> System.out.println(stringIntegerEntry));
    }

    public static void kelimeBoyutunaGoreSayma() {

        // tum kelimeleri ele alalim yazidaki. kac harften olusuyorsa ona gore nasil sayabiliriz?
        // merhaba kelimesi 7 harli, dolayisiyla 7 harfli kelimelerin sayisi 1 artacak

        String[] words = yazi.replaceAll("[,.]", "").split(" ");

        Map<Integer, Integer> kelimeCount = new HashMap<>();

        for (String word : words) {

            int letterCount = word.length();

            if (kelimeCount.containsKey(letterCount))
                kelimeCount.put(letterCount, kelimeCount.get(letterCount) + 1);
            else
                kelimeCount.put(letterCount, 1);
        }

        kelimeCount.entrySet().forEach(stringIntegerEntry -> System.out.println(stringIntegerEntry));
    }

    public static void kelimeBoyutunaGoreGruplama() {

        // tum kelimeleri ele alalim yazidaki. kac harften olusuyorsa ona gore gruplayalim.
        // merhaba kelimesi 7 harli, 7 harfli kelimeler grubunda olacak:
        // 7 -> ["merhaba", "vesaire", ...]


        String[] words = yazi.replaceAll("[,.]", "").split(" ");

        Map<Integer, Set<String>> kelimeCount = new HashMap<>();

        for (String word : words) {

            int letterCount = word.length();

            if (kelimeCount.containsKey(letterCount)) {

                Set<String> kelimeSet = kelimeCount.get(letterCount);
                kelimeSet.add(word);

                kelimeCount.put(letterCount, kelimeSet);

            } else {

                Set<String> kelimeSet = new HashSet<>();
                kelimeSet.add(word);

                kelimeCount.put(letterCount, kelimeSet);
            }
        }

        kelimeCount.entrySet().forEach(stringIntegerEntry -> System.out.println(stringIntegerEntry));
    }

}