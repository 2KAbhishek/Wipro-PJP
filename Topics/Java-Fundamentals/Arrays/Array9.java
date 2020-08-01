import java.util.ArrayList;
import java.util.Arrays;

public class Array9 {
    public static void main(String[] args) {
        int[] numbers = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();

        ArrayList<Integer> withoutTen = new ArrayList<>();
        for (int number : numbers) {
            if (number != 10)
                withoutTen.add(number);
        }

        while (numbers.length > withoutTen.size()) {
            withoutTen.add(0);
        }
        withoutTen.forEach(x -> System.out.print(x + " "));
    }
}
