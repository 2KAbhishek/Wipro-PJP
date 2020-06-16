import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map2 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("India", "Delhi");
        map.put("Japan", "Tokyo");

        Set<Entry<String, String>> set = map.entrySet();
        Iterator<Entry<String, String>> it = set.iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> me = it.next();

            if (me.getKey().equals("Japan")) {
                System.out.println("Key "+ me.getKey() +" exists");
                break;
            }
        }

        set = map.entrySet();
        it = set.iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> me = it.next();

            if (me.getValue().equals("Delhi")) {
                System.out.println("Value "+ me.getValue() + " exists");
                break;
            }
        }

        set = map.entrySet();
        it = set.iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> me = it.next();
            System.out.println(me);
        }
    }

}
