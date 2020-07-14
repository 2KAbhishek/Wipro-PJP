import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class FunInterface5 {
    static boolean isPerfectSquare(int num) {
        int n = (int) Math.sqrt(num);
        if ((double) n == Math.sqrt(num))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 3, 4, 10, 16, 24, 30, 36, 42, 49));
        Predicate<Integer> isPer = num -> isPerfectSquare(num);
        nums.stream().filter(isPer).forEach(System.out::println);
    }
}
