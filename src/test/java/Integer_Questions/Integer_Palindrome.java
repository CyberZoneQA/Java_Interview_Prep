package Integer_Questions;

public class Integer_Palindrome {
    public static void main(String[] args) {
        int check = 12321;
        System.out.println(palindrome(check));
        System.out.println(palindrome2(check));

        int check2 = 123456;
        System.out.println(palindrome(check2));
        System.out.println(palindrome2(check2));

        System.out.println(isPalindrome(898));
    }

    static boolean isPalindrome(int num) {
        int remainder;
        int reversed = 0;
        int backup =  num;
        if (num == 0) {
            return false;
        }
        while (num != 0) {
            remainder = num % 10;
            reversed = (reversed * 10) + remainder;
            num /= 10;
//            System.out.println("remainder: " + remainder + " reversed: " + reversed + "  num: " + num);
        }
        if (reversed == backup) {
            return true;
        }
        return false;
    }


    // Bu yöntemde int, stringe cevrilir ve klasik çözüm yolu izlenir
    static boolean palindrome(int n) {
        boolean result = true;
        String str = String.valueOf(n);
        int l = str.length() / 2;
        int lastIndex = str.length() - 1;
        for (int i = 0, j = lastIndex; i < l; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                result = false;
            }
        }
        return result;
    }

    // Alternatif çözüm
    static boolean palindrome2(int n) {
        // 1 - find number of digits
        // 2 - create array and initialize it starting from last index
        // 3 - compare elements of array

        boolean result = true;
        int digitCount = String.valueOf(n).length();

        int[] arr = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            arr[i] = n - (n / 10) * 10;
            n = n / 10;
        }

        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            if (arr[i] != arr[j])
                result = false;
        }
        return result;
    }
}
