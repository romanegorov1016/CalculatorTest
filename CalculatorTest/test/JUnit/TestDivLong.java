package JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDivLong {

    Calculator calc = new Calculator();

    @Test
    public void test() {
        assertEquals(5000L,calc.div(10000000000000L, 2000000000L),0.0);
    }

    @Test(expected = NumberFormatException.class)
    public void test2()throws ArithmeticException {
        calc.div(123456789L,0);
    }
}
