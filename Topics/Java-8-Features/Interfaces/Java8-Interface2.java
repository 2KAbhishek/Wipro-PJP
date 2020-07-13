@FunctionalInterface
interface Test {
    int myFunction(int a, int b, int c);
}

class TestClass implements Test {
    public static void main(String[] args) {
        Test t1 = (int a, int b, int c) -> a + b + c;
        Test t2 = (int a, int b, int c) -> a * b * c;
        System.out.println("5 + 10 + 3 = " + t1.myFunction(5, 10, 3));
        System.out.println("5 * 10 * 3 = " + t2.myFunction(5, 10, 3));
    }

    @Override
    public int myFunction(int a, int b, int c) {
        return 0;
    }
}
