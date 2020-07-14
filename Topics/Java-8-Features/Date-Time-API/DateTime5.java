import java.time.LocalTime;

public class DateTime5 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("Time now : " + now);
        System.out.println("Time after 25 minutes : " + now.plusMinutes(25));
    }
}
