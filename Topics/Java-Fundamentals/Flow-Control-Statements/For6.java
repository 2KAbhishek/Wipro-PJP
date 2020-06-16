public class For6{
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        for (int rem = 0; n > 0; n/=10){
            rem = n % 10;
            sum += rem;
        }
        System.out.println(sum);
    }
}
