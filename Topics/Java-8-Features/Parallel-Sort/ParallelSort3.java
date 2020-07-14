import java.util.Arrays;

public class ParallelSort3 {
    public static void main(String[] args) {
        int[] nums = { 10, 4, 1, 3, 6, 7, 8, 9, 2, 5 };
        Arrays.parallelSort(nums, 0, (int) (nums.length / 2));
        for (int num : nums)
            System.out.print(num + " ");
    }
}
