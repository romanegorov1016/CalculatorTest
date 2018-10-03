package TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCos {

    Calculator calc = new Calculator();

    @Test(groups={"trigonometry_operations"})
    public void test() {
        Assert.assertEquals(1,calc.sin(Math.toRadians(0)),0.0);
    }

    @Test(groups={"trigonometry_operations"})
    public void test2() {
        Assert.assertEquals(1/(Math.sqrt(2)),calc.sin(Math.toRadians(45)),0.001);
    }

    @Test(groups={"trigonometry_operations"})
    public void test3() {
        Assert.assertEquals(0,calc.sin(Math.toRadians(90)),0.0);
    }

}
