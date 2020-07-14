import java.util.Arrays;
import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoiner1 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",", "(", ")");
        ArrayList<String> langs = new ArrayList<>(Arrays.asList("C", "C++", "Java", "Python", "JavaScript"));
        langs.forEach(lang -> sj.add(lang));
        System.out.println(sj.toString());
    }
}
