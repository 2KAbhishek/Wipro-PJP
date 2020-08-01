import java.util.ArrayList;
import java.util.Arrays;

public class Array10 {
    public static void main(String[] args) {
        int[] numbers = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
        ArrayList<Integer> evenOdd = new ArrayList<>();
        Arrays.stream(numbers).forEach(num -> {
            if (num % 2 == 0)
                evenOdd.add(num);
        });
        Arrays.stream(numbers).forEach(num -> {
            if (num % 2 != 0)
                evenOdd.add(num);
        });

        evenOdd.forEach(num -> System.out.print(num + " "));
    }
}
