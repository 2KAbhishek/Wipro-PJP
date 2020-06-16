import java.util.Arrays;
public class Array2 {
   public static void main(String[] args) {

    int[] numbers = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
    Arrays.sort(numbers);
    System.out.println("Maximum = " + numbers[numbers.length - 1]);
    System.out.println("Minimum = " + numbers[0]);
   }
}
