package JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPow {

    Calculator calc = new Calculator();

    @Test
    public void test() {
        assertEquals(343,calc.pow(7, 3),0.0);
    }

    @Test
    public void test2() {
        assertEquals(2,calc.pow(4, 0.5),0.0);
    }

    @Test
    public void test3() {
        assertEquals(0.02040816326530612,calc.pow(7, -2),0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void test4()throws ArithmeticException {
        calc.pow(-7,0.5);
    }
}