import java.util.Arrays;

public class Array14 {
    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
            System.exit(1);
        }
        int[][] arr = { { Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]) },
                { Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5]) },
                { Integer.parseInt(args[6]), Integer.parseInt(args[7]), Integer.parseInt(args[8]) } };

        int[] numbers = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numbers);

        System.out.println("The given array is : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println("");
        }
        System.out.println("The biggest number in the given array is " + numbers[numbers.length - 1]);
    }

}
