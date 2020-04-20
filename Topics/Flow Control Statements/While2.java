public class While2{
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int cpn = n;
        int rev = 0;
        while(n != 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        if (cpn == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
