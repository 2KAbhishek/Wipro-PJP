import java.util.Arrays;
public class MostFrequentDigit {
    public int getMostFrequestDigit(int input1, int input2, int input3, int input4) {
        int [] nums = {input1, input2, input3, input4};
        int [] freq = new int[10];
        Arrays.fill(freq,0);

        for (int num : nums){
            while (num != 0){
                int digit = num % 10;
                freq[digit]++;
                num /= 10;
            }
        }
        int maxFreq = 0;
        for (int i = 0; i<= 9; i++){
            if (freq[maxFreq] <= freq[i]) maxFreq = i;
        }
        return maxFreq;
    }
}
