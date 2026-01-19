package Lambda;
import java.util.function.Supplier;
public class supplier {
    public static void main(String[] args) {
        Supplier<Double> ramdom = () -> Math.random();
        System.out.println(ramdom.get());
    }
}
