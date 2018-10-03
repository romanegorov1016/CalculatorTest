package JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCtg {

    Calculator calc = new Calculator();

    @Test
    public void test() {
        assertEquals(0,calc.ctg(Math.toRadians(90)),0.0);
    }

    @Test
    public void test2() {
        assertEquals(1,calc.ctg(Math.toRadians(45)),0.0);
    }

    @Test(expected = ArithmeticException.class)
    public void test3()throws ArithmeticException {
        calc.ctg(Math.toRadians(0));
    }
}
