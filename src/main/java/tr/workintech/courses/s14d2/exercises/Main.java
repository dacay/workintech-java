package tr.workintech.courses.s14d2.exercises;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        // Yontem 1
        ColdProduct halley1 = new ColdProduct(UUID.randomUUID().toString());
        halley1.setProducer("Ulker");
        halley1.setName("Halley");

        ColdProduct halley2 = new ColdProduct(UUID.randomUUID().toString());
        halley1.setProducer("Ulker");
        halley1.setName("Halley");

        ColdProduct halley3 = new ColdProduct(UUID.randomUUID().toString());
        halley1.setProducer("Ulker");
        halley1.setName("Halley");

        // Yomtem 2
        Halley h1 = new Halley(UUID.randomUUID().toString());
        Halley h2 = new Halley(UUID.randomUUID().toString());
        Halley h3 = new Halley(UUID.randomUUID().toString());
    }
}
