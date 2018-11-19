import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void add(){
        assertEquals(10, calculator.add(4,6));
    }

    @Test
    public void multiply(){
        assertEquals(30, calculator.multiply(5,6));
    }

    @Test
    public void divide(){
        assertEquals(5, calculator.divide(10,2));
    }

    @Test
    public void subtract(){
        assertEquals(8, calculator.subtract(16,8));
    }
}
