package JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSqrt {

    Calculator calc = new Calculator();

    @Test
    public void test() {
        assertEquals(0,calc.sqrt(-0),0.0);
    }

    @Test
    public void test2() {
        assertEquals(-1/7,calc.sqrt(1/49),0.0);
    }

    @Test
    public void test3() {
        assertEquals(1/7,calc.sqrt(1/49),0.0);
    }

    @Test(expected = ArithmeticException.class)
    public void test4()throws ArithmeticException {
        calc.sqrt(-1);
    }

}
