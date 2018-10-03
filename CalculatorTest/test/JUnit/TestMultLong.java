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
public class TestMultLong {

    private long numberA;
    private long numberB;
    private double expected;

    public TestMultLong(double expected,long numberA, long numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.expected = expected;
    }

    Calculator calc = new Calculator();

    @Parameters()
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1.234567900987654e+18, 1111111111L, 1111111111L},
        });
    }

    @Test
    public void test() {
        assertEquals(expected,calc.mult(numberA, numberB),0.0);
    }
}
