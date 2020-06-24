import java.util.ArrayList;
import java.util.Arrays;

public class Lambda3 {
    public static void main(String args[]) {
        ArrayList<String> arrL = new ArrayList<String>(
                Arrays.asList("Java", "Python", "C++", "C", "JavaScript", "Go", "Rust", "Bash", "Haskell", "Ruby"));

        arrL.forEach(name -> System.out.print((name.length() % 2 != 0) ? name + " " : ""));
    }
}
