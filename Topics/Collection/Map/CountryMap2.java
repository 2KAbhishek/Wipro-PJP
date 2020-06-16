import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CountryMap2 {
    private TreeMap<String, String> M1;

    public CountryMap2() {
        M1 = new TreeMap<String, String>();
    }

    public TreeMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    public String getCountry(String capitalName) {
        Set<Entry<String, String>> set = M1.entrySet();
        Iterator<Entry<String, String>> it = set.iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> me = it.next();

            if (me.getValue().equals(capitalName))
                return me.getKey();
        }

        return null;
    }

    public TreeMap<String, String> swapKyeValue() {
        TreeMap<String, String> M2 = new TreeMap<String, String>();

        Set<Entry<String, String>> set = M1.entrySet();
        Iterator<Entry<String, String>> it = set.iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> me = it.next();
            M2.put(me.getValue(), me.getKey());
        }

        return M2;
    }

    public ArrayList<String> toArrayList() {
        ArrayList<String> list = new ArrayList<>();

        for (String country : M1.keySet())
            list.add(country);

        return list;
    }
}
