package Unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AAA {
    @Test
    void testAddition(){
        //arrange
        Calculator calculator = new Calculator();

        //act
        int result = calculator.add(3,7);

        //assert
        assertEquals(10,result);
    }
}
