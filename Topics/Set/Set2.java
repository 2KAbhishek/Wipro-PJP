import java.util.HashSet;
import java.util.Iterator;

public class Set2 {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Alan");
        set.add("Binny");
        set.add("Caitlyn");
        set.add("Dio");

        Iterator<String> it = set.iterator();
        while (it.hasNext())
            System.out.println(it.next());

    }

}
