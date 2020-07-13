interface CheckPrime {
    void prime(int n);
}

public class MethodRef3 {
    MethodRef3(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }

    public static void main(String[] args) {
        CheckPrime cp = MethodRef3::new;
        System.out.print("257 Prime or Not? : ");
        cp.prime(257);
    }
}
