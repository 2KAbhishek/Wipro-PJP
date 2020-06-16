import java.util.HashMap;

public class Map1 {

    public static void main(String[] args) {
        CountryMap1 countryMap = new CountryMap1();

        countryMap.saveCountryCapital("India", "Delhi");
        countryMap.saveCountryCapital("Japan", "Tokyo");

        System.out.println(countryMap.getCapital("India"));
        System.out.println(countryMap.getCountry("Tokyo"));

        HashMap<String, String> M2 = countryMap.swapKyeValue();
        System.out.println(M2);
        System.out.println(countryMap.toArrayList());
    }

}
