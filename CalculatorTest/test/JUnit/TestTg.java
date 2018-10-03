package JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTg {

    Calculator calc = new Calculator();

    @Test
    public void test() {
        assertEquals(0,calc.tg(Math.toRadians(0)),0.0);
    }

    @Test
    public void test2() {
        assertEquals(1,calc.tg(Math.toRadians(45)),0.0);
    }

    @Test(expected = ArithmeticException.class)
    public void test3()throws ArithmeticException {
        calc.tg(Math.toRadians(90));
    }
}
