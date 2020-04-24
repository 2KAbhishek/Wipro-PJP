public class NthPrime {
    public static int nthPrime(int input1) {
        int num = 1, count = 0, i;
        while(count < input1){
            num++;
            for (i = 2; i <= num; i++)
                if (num % i == 0) break;
            if (i == num) count++;
        }
        return num;
    }
}
