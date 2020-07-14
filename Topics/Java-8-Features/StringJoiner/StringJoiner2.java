import java.util.StringJoiner;

public class StringJoiner2 {
    public static void main(String[] args) {
        StringJoiner s1 = new StringJoiner("-");
        s1.add("Kolkata");
        s1.add("Chandigarh");
        s1.add("New Delhi");
        StringJoiner s2 = new StringJoiner("-");
        s2.add("Bangalore");
        s2.add("Hyderabad");
        s2.add("Mumbai");

        System.out.println(s1.merge(s2));
        System.out.println(s2.merge(s1));
    }
}
