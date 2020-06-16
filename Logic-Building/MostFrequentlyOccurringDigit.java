import java.io.*;
import java.util.*;
class MostFrequentlyOccurringDigit {
    public int mostFrequentlyOccurringDigit(int[] input1,int input2){
        StringBuilder input = new StringBuilder();
        for (int ip : input1) input.append(ip);
        int[] freq = new int[10];
        for (int j = 0; j < input.length(); j++) {
            freq[Integer.parseInt(String.valueOf(input.charAt(j)))]++;
        }
        int maxFreqIndex = 0;
        int maxFreq = 0;
        for (int i = 9; i >= 0; i--) {
            if (freq[i] > maxFreq) {
                maxFreqIndex = i;
                maxFreq = freq[i];
            }
        }
        return maxFreqIndex;
    }
}
