package Unit;
import org.junit.jupiter.api.Test;

//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathServiceTest {
    @Test
    void testSqaure(){
        MathService service = new MathService();
        assertEquals(25,service.square(5));
    }

    @Test
    void testWhenAGreater(){
        MathService service = new MathService();
        assertEquals(10,service.max(10,5));
    }
    @Test
    void testWhenBGreater(){
        MathService service = new MathService();
        assertEquals(8,service.max(3,8));
    }

}
