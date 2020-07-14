import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class DateTime2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate nextMonth = LocalDate.of(today.getYear(), today.plusMonths(1).getMonth(), 1);
        LocalDate secSunday = nextMonth.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY))
                .with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println("Second Sunday of next month : " + secSunday);
    }
}
