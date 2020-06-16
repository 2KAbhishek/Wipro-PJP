import java.io.*;
import java.util.*;

class SimpleEncodedArray {
    public class Result{
        public final int output1;
        public final int output2;

        public Result(int out1, int out2){
            output1 = out1;
            output2 = out2;
        }
    }

    public Result findOriginalFirstAndSum(int[] input1,int input2){
        int[] out = new int[input1.length];
        out[out.length - 1] = input1[input1.length - 1];

        for (int i = input1.length - 1; i > 0; i--) {
            out[i - 1] = input1[i - 1] - out[i];
        }

        int sum = 0;
        for (int item : out)
            sum += item;

        return new Result(out[0], sum);
    }
}
