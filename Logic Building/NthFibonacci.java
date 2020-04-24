public class NthFibonacci {
    public long nthFibonacci (int input1) {
        long first = 0, second = 1, sum;

        for (int i = 1; i < input1; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }

        return first;
    }
}
