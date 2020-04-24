public class DigitSum {
    public static int getDigitSum (int input1) {
        int digitCount = String.valueOf(input1).length();
        if (digitCount == 1) return input1;

        int sum = 0;
        int number = input1;
        if (input1 < 0) number *= -1;

        while (digitCount != 1) {
            int currentSum = 0;
            while (number != 0) {
                currentSum += number % 10;
                number /= 10;
            }
            sum = currentSum;
            number = sum;
            digitCount = String.valueOf(sum).length();
        }

        if (input1 < 0) sum *= -1;
        return sum;
    }
}
