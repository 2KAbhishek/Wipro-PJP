import java.util.TreeMap;
public class Map5 {

    public static void main(String[] args) {
        CountryMap2 countryMap = new CountryMap2();

        countryMap.saveCountryCapital("India", "Delhi");
        countryMap.saveCountryCapital("Japan", "Tokyo");

        System.out.println(countryMap.getCapital("India"));
        System.out.println(countryMap.getCountry("Tokyo"));

        TreeMap<String, String> M2 = countryMap.swapKyeValue();
        System.out.println(M2);
        System.out.println(countryMap.toArrayList());
    }

}
