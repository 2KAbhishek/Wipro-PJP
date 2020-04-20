public class Set1 {
    public static void main(String[] args) {
        Country1 countries = new Country1();
        countries.saveCountryNames("India");
        countries.saveCountryNames("USA");
        countries.saveCountryNames("El Salvador");
        countries.saveCountryNames("Russia");
        countries.saveCountryNames("Japan");

        System.out.println("China: " + countries.getCountry("Brazil"));
        System.out.println("Japan: " + countries.getCountry("Japan"));
    }


}
