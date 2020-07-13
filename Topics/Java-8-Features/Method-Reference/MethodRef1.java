interface Factorial {
    int factorial(int n);
}

public class MethodRef1 {
    public int fact(int n) {
        int fact = 1;
        while (n > 0) {
            fact *= n;
            n--;
        }
        return fact;
    }

    public static void main(String[] args) {
        MethodRef1 methodRef1 = new MethodRef1();
        Factorial f = methodRef1::fact;
        System.out.println("Factorial of 5 : " + f.factorial(5));
    }
}
