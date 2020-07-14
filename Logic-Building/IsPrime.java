public class IsPrime {
    public int isPrime(int input1) {
        if (1 == input1)
            return 1;

        for (int i = 2; i <= Math.sqrt(input1); i++)
            if (input1 % i == 0)
                return 1;

        return 2;
    }
}
