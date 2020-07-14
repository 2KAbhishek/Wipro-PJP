public class For3 {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n) + 1; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String out = (isPrime(n)) ? "Prime" : "Not Prime";
        System.out.println(out);
    }
}
