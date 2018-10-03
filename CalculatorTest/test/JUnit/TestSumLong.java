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
public class TestSumLong {

    private long numberA;
    private long numberB;
    private long expected;

    public TestSumLong(long expected,long numberA, long numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.expected = expected;
    }

    Calculator calc = new Calculator();

    @Parameters()
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1201702950286L, 600851475143L, 600851475143L},
                {3087L, -1234L, 4321L},
                {0L, -0L, 0L},
                {0L, -123456789L, 123456789L}
        });
    }

    @Test
  public void test() {
      assertEquals(expected,calc.sum(numberA, numberB));
  }
}
