package String_Questions;

public class String_countSpecificWordInSentence {
    public static void main(String[] args) {

        String str = "cat";
        String sentence = "cat stevens loves cats ans dogs.catcat here cat cat there";
        countWord(sentence, str);
    }

    private static void countWord(String sentence, String word) {
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (!sentence.contains(word))
                break;
            count++;
            sentence = sentence.replaceFirst(word, "");
        }

        System.out.println(count);
    }
}
