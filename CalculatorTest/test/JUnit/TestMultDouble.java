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
public class TestMultDouble {

    private double numberA;
    private double numberB;
    private double expected;

    public TestMultDouble(double expected,double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.expected = expected;
    }

    Calculator calc = new Calculator();

    @Parameters()
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0.0152406432, 0.123456, 0.12345},
        });
    }

    @Test
    public void test() {
        assertEquals(expected,calc.mult(numberA, numberB),0.0);
    }
}

