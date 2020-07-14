import java.util.ArrayList;
import java.util.Arrays;

public class Lambda1 {
    public static void main(String args[]) {
        ArrayList<Integer> arrL = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
                15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25));

        arrL.forEach(num -> {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.print(isPrime ? num + " " : "");
        });
    }
}
