import java.time.LocalTime;

public class DateTime6 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("Time now : " + now);
        System.out.println("Time before 5 hours and 30 minutes : " + now.minusHours(5).minusMinutes(30));
    }
}
