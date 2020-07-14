import java.time.LocalDate;

public class DateTime4 {
    public static void main(String[] args) {
        boolean isLeap = LocalDate.now().isLeapYear();
        if (isLeap)
            System.out.println("Leap Year.");
        else
            System.out.println("Not Leap Year.");
    }
}
