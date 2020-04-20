import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountryMap3 {
    private Hashtable<String, String> M1;

    public CountryMap3() {
        M1 = new Hashtable<String, String>();
    }

    public Hashtable<String, String> saveCountryCapital(String countryName, String capital) {
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

    public Hashtable<String, String> swapKyeValue() {
        Hashtable<String, String> M2 = new Hashtable<String, String>();

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
