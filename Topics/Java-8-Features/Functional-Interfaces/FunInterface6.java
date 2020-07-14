import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class FunInterface6 {
    static String revString(String str) {
        StringBuffer sbr = new StringBuffer();
        sbr.append(str);
        return sbr.reverse().toString();
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(
                Arrays.asList("PHP", "LOL", "Dial", "Tears", "Hard", "Racecar", "Level", "Crazy", "Madam", "Potato"));
        ArrayList<String> revWords = new ArrayList<>();
        Consumer<String> rev = str -> revWords.add(revString(str));
        words.forEach(str -> rev.accept(str));
        words = revWords;
        words.forEach(System.out::println);
    }
}
