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
public class TestSubLong {

    private long numberA;
    private long numberB;
    private long expected;

    public TestSubLong(long expected,long numberA, long numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.expected = expected;
    }

    Calculator calc = new Calculator();

    @Parameters()
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {-5407663276291L, 600851475143L, 6008514751434L}

        });
    }

    @Test
    public void test() {
        assertEquals(expected,calc.sub(numberA, numberB),0.0);
    }
}


