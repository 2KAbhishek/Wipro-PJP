import java.util.ArrayList;

public class Lambda2 {
    public static void main(String args[]) {
        ArrayList<StringBuffer> arrL = new ArrayList<StringBuffer>();
        String[] names = { "Java", "Python", "C++", "C", "JavaScript", "Go", "Rust", "Bash", "Haskell", "Ruby" };

        for (String name : names) {
            StringBuffer sbr = new StringBuffer(name);
            arrL.add(sbr);
        }

        arrL.forEach(name -> System.out.println(name.reverse()));
    }
}
