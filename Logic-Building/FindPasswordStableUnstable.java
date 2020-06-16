import java.io.*;
import  java.util.*;
public class FindPasswordStableUnstable {
    public int findPassword(int input1,int input2,int input3,int input4,int input5){
        int[] nums = {input1, input2, input3, input4, input5};
        int stable = 0, unstable = 0;
        for (int num: nums){
            if (isStable(num)) stable += num;
            else unstable += num;
        }
        return stable - unstable;
    }

    public static boolean isStable(int num) {
        boolean isStable = true;
        int[] freq = new int[10];
        String numStr = String.valueOf(num);
        for (int i = 0; i < numStr.length(); i++) {
            freq[Integer.parseInt(String.valueOf(numStr.charAt(i)))]++;
        }
        int primFreq = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                primFreq = freq[i];
                break;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (freq[i] != 0 && freq[i] != primFreq) {
                isStable = false;
                break;
            }
        }
        return isStable;
    }
}
