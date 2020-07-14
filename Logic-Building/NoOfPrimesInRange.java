public class NoOfPrimesInRange {
    public static int noOfPrimesInRange(int input1, int input2) {
        int primeCount = 0;

        while (input1 <= input2) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(input1); i++)
                if (input1 % i == 0)
                    isPrime = false;

            if (isPrime)
                primeCount++;

            input1++;
        }
        return primeCount;
    }
}
