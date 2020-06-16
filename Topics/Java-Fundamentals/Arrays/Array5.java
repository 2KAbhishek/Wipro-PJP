import java.util.Arrays;
public class Array5 {
   public static void main(String[] args) {

    int[] nums = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
    Arrays.sort(nums);
    System.out.println("Maximum 2 = " + nums[nums.length - 1] + " , " + nums[nums.length -2]);
    System.out.println("Minimum 2 = " + nums[0] + " , " + nums[1]);
   }
}
