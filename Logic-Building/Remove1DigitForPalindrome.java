import java.io.*;
import java.util.*;
public class Remove1DigitForPalindrome {
    public int digitRemove_Palin(int input1){
        StringBuilder num = new StringBuilder(String.valueOf(input1));

        for (int i = 0; i < num.length(); i++) {
            if (isPalindrome(num.toString())) return -1;

            char removed = num.charAt(i);
            String newNum = num.deleteCharAt(i).toString();

            if (isPalindrome(newNum)) {
                return Integer.parseInt(String.valueOf(removed));
            } else {
                num.insert(i, removed);
            }
        }
        return -1;
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int len = str.length();
        boolean isPalindrome = true;
        int range = len / 2;

        if (len % 2 == 0) range--;

        for (int i = 0; i <= range; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) isPalindrome = false;
        }
        return isPalindrome;
    }
}
