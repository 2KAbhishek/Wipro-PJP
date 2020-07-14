public class For4 {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        for (int n = 10; n <= 99; n++) {
            if (isPrime(n)) {
                System.out.println(n);
            }
        }
    }
}
