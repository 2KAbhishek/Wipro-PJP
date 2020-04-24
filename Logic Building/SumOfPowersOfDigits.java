import java.io.*;
import  java.util.*;

class SumOfPowersOfDigits {
    public int sumOfPowerOfDigits(int input1){
        if (input1 <= 9) return 0;

        String num = String.valueOf(input1);
        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            if (i == num.length() - 1) {
                sum += 1;
                System.out.println(num.charAt(i) + " ^ " + 0);
            } else {
                sum += Math.pow(Integer.parseInt(String.valueOf(num.charAt(i))),
                        Integer.parseInt(String.valueOf(num.charAt(i + 1))));
            }
        }
        return sum;
    }
}
