package JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDivDouble {

    Calculator calc = new Calculator();

    @Test
    public void test() {
        assertEquals(1.6,calc.div(3.2, 2.0),0.0);
    }

    @Test(expected = NumberFormatException.class)
    public void test2()throws NumberFormatException {
        calc.div(5.6,0.0);
    }
}
