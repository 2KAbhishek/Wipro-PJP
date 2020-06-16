import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List3 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("String 1");
        list.add("String 2");
        list.add("String 3");
        list.add("String 4");

        printAll(list);
    }

    public static void printAll(List<String> list) {
        Iterator<String> it = list.iterator();

        while (it.hasNext())
            System.out.println(it.next());
    }
}
