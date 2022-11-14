package CalcTestsPackage;

import CalcApp.Calc;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcDivisionTests {
    @Test(expectedExceptions = ArithmeticException.class)
    public void division_zero_division_is_invalid(){
        Calc calc = new Calc();

        calc.divide(2, 0);
    }

    @Test
    public void division_is_calcuated_properly(){
        Calc calc = new Calc();

        Assert.assertEquals(calc.divide(4,2), 1);
    }
}
