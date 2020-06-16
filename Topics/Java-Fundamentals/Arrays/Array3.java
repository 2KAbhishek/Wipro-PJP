import java.util.Arrays;
import java.util.Scanner;
public class Array3 {
   public static void main(String[] args) {
    int[] numbers = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
    int out = -1;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter search term: ");
    int search = scan.nextInt();
    scan.close();
    for (int num = 0; num <= numbers.length; num++){
        if (num == search){
            out = num - 1;
        }
    }
    System.out.println(out);
   }
}
