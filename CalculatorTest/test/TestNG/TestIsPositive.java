package TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestIsPositive {

    Calculator calc = new Calculator();

    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() {
        return new Object[][] { { 123456789L, true },
                                { 0L, false },
                                { -123456789L, false },
                                 {Long.MAX_VALUE, true}
        };
    }

    @Test(dataProvider = "data-provider", groups = {"mathematical_operations"})
    public void testMethod(long number, boolean expected) {
        Assert.assertEquals(calc.isPositive(number), expected);
    }
}
