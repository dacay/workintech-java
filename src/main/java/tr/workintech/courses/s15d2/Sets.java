package tr.workintech.courses.s15d2;

import java.util.*;

public class Sets {

    public static void main(String[] args) {

        Set<Integer> yasKumesi = new HashSet<>();

        yasKumesi.add(30);
        yasKumesi.add(40);
        yasKumesi.add(50);

        Set<String> isimKumesi = new HashSet<>();
        isimKumesi.add("Deniz");
        isimKumesi.add("Deniz");
        isimKumesi.add("Munir");
        isimKumesi.add("MehmetAli");
        isimKumesi.add("Tunahan");

        // Diger tiplere gore cok daha hizli
        isimKumesi.contains("Deniz");

//        System.out.println(isimKumesi); // Siralama tamamen farkli

        Set<String> siraliIsimListesi = new LinkedHashSet<>();
        siraliIsimListesi.add("Deniz");
        siraliIsimListesi.add("Deniz");
        siraliIsimListesi.add("Munir");
        siraliIsimListesi.add("MehmetAli");
        siraliIsimListesi.add("Tunahan");

//        System.out.println(siraliIsimListesi);

        Set<String> ozelSiraliIsimKumesi = new TreeSet<>(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return -1 * o1.compareTo(o2); // -1 ile carparak ters cevirmis oldum
            }
        });

        ozelSiraliIsimKumesi.add("Deniz");
        ozelSiraliIsimKumesi.add("Deniz");
        ozelSiraliIsimKumesi.add("Munir");
        ozelSiraliIsimKumesi.add("MehmetAli");
        ozelSiraliIsimKumesi.add("Tunahan");

//        System.out.println(ozelSiraliIsimKumesi);

        Set<Integer> ogrenciNoSet = new HashSet<>();
        ogrenciNoSet.add(1000);
        ogrenciNoSet.add(1001);
        ogrenciNoSet.add(1002);
        ogrenciNoSet.add(1003);

        Set<Integer> degismeyenOgrenciNoSet = Collections.unmodifiableSet(ogrenciNoSet);

//        degismeyenOgrenciNoSet.add(1005);

        ogrenciNoSet.add(1004);

        System.out.println(ogrenciNoSet.containsAll(degismeyenOgrenciNoSet));
        System.out.println(degismeyenOgrenciNoSet.containsAll(ogrenciNoSet));

        // Verilen kaynak koleksiyondaki degisimler, unmodifiable versiyonundakine yansiyor!!!!
    }
}
