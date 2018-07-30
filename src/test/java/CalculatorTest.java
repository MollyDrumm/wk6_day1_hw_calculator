import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void addNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(3,1) );
    }

    @Test
    public void subtractNumbers(){
        Calculator calculator = new Calculator();
        assertEquals( 6, calculator.subtract(7,1) );
    }

    @Test
    public void multiplyNumbers(){
        Calculator calculator = new Calculator();
        assertEquals( 10, calculator.multiply(5,2));
    }

    @Test
    public void divideNumbers(){
        Calculator calculator = new Calculator();
        assertEquals( 3, calculator.divide(6,2));
    }
}
