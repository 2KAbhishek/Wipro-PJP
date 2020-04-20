import java.util.Arrays;
public class Array4 {
   public static void main(String[] args) {

    int[] numbers = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
    char ch;
    for (int num: numbers) {
        ch = (char)num;
        System.out.print(ch + " ");
    }
   }
}
