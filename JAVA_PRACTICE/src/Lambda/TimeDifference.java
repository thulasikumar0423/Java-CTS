package Lambda;
import java.time.Duration;
import java.time.LocalTime;
public class TimeDifference {
    public static void main(String[] args) {

        LocalTime startTime = LocalTime.of(10, 30);
        LocalTime endTime = LocalTime.now();

        Duration duration = Duration.between(startTime, endTime);

        System.out.println("Hours   : " + duration.toHours());
        System.out.println("Minutes : " + duration.toMinutes());
        System.out.println("Seconds : " + duration.getSeconds());
        System.out.println("Nano Seconds : " + duration.getNano());
    }
}
