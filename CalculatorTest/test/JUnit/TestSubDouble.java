package JUnit;

import static org.junit.Assert.assertEquals;

import com.epam.tat.module4.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestSubDouble {

    private double numberA;
    private double numberB;
    private double expected;

    public TestSubDouble(double expected,double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.expected = expected;
    }

    Calculator calc = new Calculator();

    @Parameters()
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1.111111, 2.345678, 1.234567},
        });
    }

    @Test
    public void test() {
        assertEquals(expected,calc.sub(numberA, numberB),0.0);
    }
}
