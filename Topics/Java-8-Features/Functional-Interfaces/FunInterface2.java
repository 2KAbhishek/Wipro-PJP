import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class FunInterface2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int sum = 0;
        Function<ArrayList<Integer>, Integer> add = num -> {
            int total = 0;
            for (int n : num)
                total += n;
            return total;
        };
        sum += add.apply(nums);
        System.out.println("Sum is : " + sum);
    }
}
