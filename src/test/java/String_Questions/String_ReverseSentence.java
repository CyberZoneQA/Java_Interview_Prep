package String_Questions;

public class String_ReverseSentence {
    public static void main(String[] args) {
        // sentence --> "java is fun"
        // reversed --> "fun is java"

        reverseSentence("java       is fun");

    }

    public static void reverseSentence(String str) {
        String reversed = "";
        String[] splited = str.split("\\s+");
        for (int i = splited.length-1; i >= 0; i--) {
            reversed += splited[i] + " ";
        }
        System.out.println(reversed.trim());
    }
}

