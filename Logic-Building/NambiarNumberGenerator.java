import java.io.*;
import java.util.*;
public class NambiarNumberGenerator {
    public int nnGenerator(String input1){
        String mobileNo = input1;
        StringBuilder numbiarNo = new StringBuilder();

        for (int i = 0; i < mobileNo.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(mobileNo.charAt(i)));
            int evenOdd = digit % 2 == 0 ? 0 : 1;
            int sum = digit;
            int j = i + 1;

            if (j == mobileNo.length()) {
                numbiarNo.append(digit);
                break;
            }

            while (true) {
                sum += Integer.parseInt(String.valueOf(mobileNo.charAt(j++)));

                if (sum % 2 != evenOdd || j >= mobileNo.length()) {
                    numbiarNo.append(sum);
                    i = j - 1;
                    break;
                }
            }
        }
        return Integer.parseInt(numbiarNo.toString());
    }
}
