
public class Demo2 {
    public boolean palindromeCheck(String str){
        str = str.toLowerCase();
        int length = str.length();
        boolean isPalindrome = true;

        int range = length / 2;
        if (length % 2 == 0) range--;

        for (int i = 0; i <= range; i++){
            if (str.charAt(i) != str.charAt(length - i - 1)) isPalindrome = false;
        }

        return isPalindrome;
    }
}
