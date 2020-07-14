import java.time.LocalDate;
import java.time.Period;

public class DateTime3 {
    public static void main(String[] args) {
        LocalDate start = LocalDate.parse("2020-02-01");
        LocalDate now = LocalDate.now();
        Period per = Period.between(start, now);
        System.out.println("Years : " + per.getYears() + " Months : " + per.getMonths() + " Days : " + per.getDays());
    }
}
