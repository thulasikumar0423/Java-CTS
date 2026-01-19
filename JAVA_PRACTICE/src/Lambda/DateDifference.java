package Lambda;
import java.time.LocalDate;
import java.time.Period;
public class DateDifference {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2023,4,12);
        LocalDate endDate = LocalDate.now();

        Period period = Period.between(startDate,endDate);
        System.out.println("Years : " + period.getYears());
        System.out.println("Months: "+ period.getMonths());
        System.out.println("Day: "+ period.getDays());

    }
}
