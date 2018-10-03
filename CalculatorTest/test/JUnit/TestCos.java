package JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCos {

    Calculator calc = new Calculator();

    @Test
    public void test() {
        assertEquals(1,calc.cos(Math.toRadians(0)),0.0);
    }

    @Test
    public void test2() {
        assertEquals(1/(Math.sqrt(2)),calc.cos(Math.toRadians(45)),0.001);
    }

    @Test
    public void test3() {
        assertEquals(0,calc.cos(Math.toRadians(90)),0.0);
    }

}
