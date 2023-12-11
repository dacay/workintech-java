package tr.workintech.courses.s15d1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteration {

    public static void main(String[] args) {

        Iterator<String> iterator = null;

        // Klasik iterator kullanimi
        while(iterator.hasNext()) {

            String item = iterator.next();

            // Item ile bir seyler yap...
        }

        List<String> list1 = new ArrayList<>();

        // Bir collection'dan iterator alma
        list1.iterator();

        Iterable<String> iterable = null;

        // Yeni for each syntax'i. Iterable interface'ine sahip objelerde ise yariyor
        for (String item : iterable) {

        }

        // Demek ki, bir collection tipini ya iterator'ini alip donebiliriz ya da yeni for each syntax'i ile.
        // 1. yol
        Iterator<String> listIterator = list1.iterator();
        while(listIterator.hasNext()) {

            String item = listIterator.next();

            // Item ile bir seyler yap...
        }

        // 2. yol
        for (String item : list1) {

            // Item ile bir seyler yap...
        }

    }
}
