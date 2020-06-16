import java.util.ArrayList;
import java.util.Collections;
public class NonRepeatedDigitsCount {
    public static int nonRepeatedDigitsCount(int input1) {
        int count = 0;
        ArrayList<Integer> nums = new ArrayList<Integer>();

        while(input1 != 0){
            int digit = input1 % 10;
            nums.add(digit);
            input1 /= 10;
        }

        for (int num : nums)
            if (Collections.frequency(nums, num) == 1) count++;

        return count;
    }
}
