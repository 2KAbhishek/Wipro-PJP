import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class FunInterface7 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 3, 4, 10, 13, 24, 31, 36, 42, 49));
        Consumer<Integer> eo = num -> {
            String s = num % 2 == 0 ? " even" : " odd";
            System.out.println(num + s);
        };

        nums.forEach(n -> eo.accept(n));
    }
}
