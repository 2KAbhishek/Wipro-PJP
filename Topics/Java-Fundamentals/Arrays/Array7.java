import java.util.*;

public class Array7 {
   public static void main(String[] args) {
    int[] nums = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
    Set<Integer> set = new HashSet<Integer>();
    for (int num : nums)
        set.add(num);
    for (int num : set)
        System.out.print(num + " ");
   }
}
