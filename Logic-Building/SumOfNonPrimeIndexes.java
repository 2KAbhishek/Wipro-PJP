public class SumOfNonPrimeIndexes {
    public int sumOfNonPrimeIndexes(int[] input1, int input2) {
        int sum = 0;
        for (int i = 0; i <= Math.sqrt(input2); i++)
            if (!isPrime(i))
                sum += input1[i];
        return sum;
    }

    public static boolean isPrime(int input1) {
        if (1 == input1 || 0 == input1)
            return false;
        for (int i = 2; i < input1; i++) {
            if (i == input1)
                continue;
            if (input1 % i == 0) {
                return false;
            }
        }
        return true;
    }
}
