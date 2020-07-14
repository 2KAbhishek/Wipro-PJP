import java.util.ArrayList;
import java.util.function.Supplier;

public class FunInterface8 {
    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<>();
        Supplier<ArrayList<Integer>> getPrimes = () -> {
            ArrayList<Integer> p = new ArrayList<>();
            for (int i = 2; p.size() < 11; i++) {
                if (isPrime(i))
                    p.add(i);
            }
            return p;
        };
        primes = getPrimes.get();
        primes.forEach(System.out::println);
    }

    public static boolean isPrime(int input1) {
        for (int i = 2; i <= Math.sqrt(input1); i++)
            if (input1 % i == 0)
                return false;

        return true;
    }
}
