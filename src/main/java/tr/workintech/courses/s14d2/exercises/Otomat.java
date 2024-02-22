package tr.workintech.courses.s14d2.exercises;

public class Otomat {

    int max = 10;

    /*
    [x] [ ]
    [ ] [ ]

    2x2'lik bir satranc tahtasi -> 2 boyut
    Object[][] taslar = new Object[][] {};
    taslar[0][0]

    Object[][][] -> ilk index       -> yukaridan asagiya sira`
                    ikinci index    -> soldan saga sira
                    ucuncu index    -> slotta geriye dogru siralanan urunler
     */

    private Product[][][] hotProducts = new Product[][][] {};
    private Product[][][] coldProducts = new Product[][][] {};
    private int[][] coldProductCounts = new int[2][2];

    public Product getColdProduct(int i, int j) {

        int currentCount = coldProductCounts[i][j];

        if (currentCount > 0)
            return coldProducts[i][j][0];
        else
            throw new IllegalStateException("Urun bitti!");
    }

    public void addColdProduct(int i, int j, ColdProduct coldProduct) {

        int currentCount = coldProductCounts[i][j];

        if (currentCount >= max)
            return;

        coldProducts[i][j][currentCount] = coldProduct;
    }
}
