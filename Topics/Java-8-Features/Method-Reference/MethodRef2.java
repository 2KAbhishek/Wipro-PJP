interface DigitCount {
    int digitCount(int n);
}

public class MethodRef2 {
    public static int count(int n) {
        int count = Integer.toString(n).length();
        return count;
    }

    public static void main(String[] args) {
        DigitCount dc = MethodRef2::count;
        System.out.println("DigitCount of 500 : " + dc.digitCount(500));
    }
}
