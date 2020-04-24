public class EvenOddDigitsSum {
    public static int evenOddDigitsSum(int input1, String input2) {
        int evenSum = 0;
        int totalSum = 0;

        while (input1 != 0) {
            int digit = input1 % 10;
            totalSum += digit;
            if (digit % 2 == 0) evenSum += digit;
            input1 /= 10;
        }

        if (input2.equals("even")) return evenSum;
        else return totalSum - evenSum;
    }
}
