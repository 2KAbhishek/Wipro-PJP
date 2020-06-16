import java.util.ArrayList;
public class UniqueDigitsCount {
    public static int uniqueDigitsCount(int input1) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        while (input1 != 0){
            int digit = input1 % 10;
            if (!nums.contains(digit)) nums.add(digit);
            input1 /= 10;
        }
        return nums.size();
    }
}
