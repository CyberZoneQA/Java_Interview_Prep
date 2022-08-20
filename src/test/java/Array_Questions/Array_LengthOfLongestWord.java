package Array_Questions;

public class Array_LengthOfLongestWord {
    public static void main(String[] args) {

        String str = "The cow jumped over the moon.";
        System.out.println(lenghtOfLongestWord(str));           // 6

    }

    public static int lenghtOfLongestWord(String sentence) {
        // Remove digits & special charachters & multiple spaces
        // sentence = sentence.replaceAll("[^a-zA-Z]", " ");
        // sentence = sentence.replaceAll("\\s+", " ");

        String[] arr = sentence.split(" ");

        int maxLength = 0;
        for(String each:arr){
            if(each.length()>maxLength){
                maxLength = each.length();
            }
        }
        return maxLength;
    }
}
