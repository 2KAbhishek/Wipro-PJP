import java.util.Optional;

public class Optional2 {
    public static void main(String[] args) {
        String address = null;
        // address = "Earth";
        Optional<String> adres = Optional.ofNullable(address);
        System.out.println(adres.orElse("India"));
    }
}
