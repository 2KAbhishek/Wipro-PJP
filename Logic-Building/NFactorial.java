public class NFactorial {
    private static int nFactorial(int input1) {
        if (input1 < 2) return 1;
        return input1 * nFactorial(input1 - 1);
    }
}
