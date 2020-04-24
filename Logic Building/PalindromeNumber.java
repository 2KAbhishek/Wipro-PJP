public class PalindromeNumber {
    public int palindromeNumber (int input1) {
        int num = input1, rev = 0;
        while (input1 != 0){
            int digit = input1 % 10;
            rev = rev * 10 + digit;
            input1 /= 10;
        }
        if (num == rev) return 2;
        else return 1;
    }
}
