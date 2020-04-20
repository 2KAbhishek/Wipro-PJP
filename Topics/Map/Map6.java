import java.util.Hashtable;

public class Map6 {

    public static void main(String[] args) {
        CountryMap3 countryMap = new CountryMap3();

        countryMap.saveCountryCapital("India", "Delhi");
        countryMap.saveCountryCapital("Japan", "Tokyo");

        System.out.println(countryMap.getCapital("India"));
        System.out.println(countryMap.getCountry("Tokyo"));

        Hashtable<String, String> M2 = countryMap.swapKyeValue();
        System.out.println(M2);
        System.out.println(countryMap.toArrayList());
    }

}
