import java.util.Arrays;
public class Array6 {
   public static void main(String[] args) {
    int[] nums = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
    Arrays.sort(nums);
    for (int num : nums)
        System.out.println(num);
   }
}
