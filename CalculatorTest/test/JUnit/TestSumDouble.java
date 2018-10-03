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
public class TestSumDouble {

    private double numberA;
    private double numberB;
    private double expected;

    public TestSumDouble(double expected,double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.expected = expected;
    }

    Calculator calc = new Calculator();

    @Parameters()
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0.333333333334, 0.222222222222, 0.111111111112},
                {-0.666666, -0.123456, -0.543210},
                {}
        });
    }

    @Test
    public void test() {
        assertEquals(expected,calc.sum(numberA, numberB),0.0);
    }
}
