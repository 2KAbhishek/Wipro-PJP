import java.util.Arrays;
import java.util.Scanner;

public class ParallelSort2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String in = scan.nextLine();
        scan.close();

        char[] chars = in.toCharArray();
        Arrays.parallelSort(chars);
        String out = "";

        for (char c : chars)
            out += c;

        System.out.println(out);
    }

}
