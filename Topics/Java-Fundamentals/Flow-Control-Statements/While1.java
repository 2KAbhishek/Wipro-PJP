public class While1{
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int rev = 0;
        while(n != 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        System.out.println(rev);
    }
}
