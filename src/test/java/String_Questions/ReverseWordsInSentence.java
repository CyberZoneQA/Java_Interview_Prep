package String_Questions;

public class ReverseWordsInSentence {
    public static void main(String[] args) {

        String str = "Finding defects is the tester's most important task";
        String[] words = str.split(" ");

        for(String each : words){
            char[] chars = each.toCharArray();
            for(int i= chars.length-1 ; i>=0 ;i--){
                System.out.print(chars[i]);
            }
            System.out.print(" ");
        }


    }
}

// ketrebyC hctaB natrapS si tsom gnikrowdrah hctaB reve