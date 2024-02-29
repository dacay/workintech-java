package tr.workintech.courses.s14d4;

public class StringSinifi {

    public static void main(String[] args) {

        String s = "Merhaba";
        // String -> char[] (C/C++ dillerinde)
        // Java'da referans tipinde bir degisken gibi gorunuyor

        String s2 = "Merhaba" + " " + "Dunya!";
        String s3 = "Merhaba";

        String s4 = "Merhaba " + new ToggCar();

        System.out.println(s4);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Merhaba");
        stringBuilder.append(" ");
        stringBuilder.append("Dunya!");

        char[] stringArr = s4.toCharArray();

        for (int i = 0; i < s4.length(); i++) {

            char c = s4.charAt(i);

            // Islemi burada yapabiliriz...
        }

        System.out.println(stringBuilder.toString());
    }
}
