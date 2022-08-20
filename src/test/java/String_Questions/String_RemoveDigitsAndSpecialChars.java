package String_Questions;

public class String_RemoveDigitsAndSpecialChars {
    public static void main(String[] args) {

        String sentence = "Dersler_duzenlenecek.Merhaba, 53Dunyali!!!";

        System.out.println(cleanString(sentence));                              // Dersler_duzenlenecek.Merhaba Dunyali

    }

    public static String cleanString(String str){
        str = str.replaceAll("[^a-zA-Z]", " ");
        str = str.replaceAll("\\s+", " ");              // to clean the spaces
        return str;
    }
}

// "\\s" olsaydi, birsey degismezdi. Space'i space ile degistirmis olurdu.
// "\\s+" ile multiple space olan yerlerin yerine tek space koyuyoruz


// Dersler_duzenlenecek.Merhaba    Dunyali
// Dersler_duzenlenecek.Merhaba Dunyali