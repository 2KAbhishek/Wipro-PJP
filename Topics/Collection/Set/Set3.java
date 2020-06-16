import java.util.Iterator;
import java.util.TreeSet;

public class Set3 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        TreeSet<String> setRev = new TreeSet<>();

        set.add("Black");
        set.add("Red");
        set.add("Green");
        set.add("Blue");

        System.out.println("Original TreeSet:" + set);

        setRev = (TreeSet<String>) set.descendingSet();
        System.out.println("Reversed TreeSet:" + setRev);

        Iterator<String> it = set.iterator();
        String query = "Yellow";
        boolean result = false;

        while (it.hasNext()) {
            if (it.next().equals(query)) {
                result = true;
                break;
            }
        }
        if (result) System.out.println(query + " exists in set");
        else System.out.println(query + " doesn't exist in set");
    }
}
