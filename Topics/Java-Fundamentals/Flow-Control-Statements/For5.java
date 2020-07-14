public class For5 {
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter an integer number");
            System.exit(0);
        }
        int n = Integer.parseInt(args[0]);
        if (n <= 1) {
            System.out.println(n + " is neither prime nor composite");
        } else if (isPrime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}
