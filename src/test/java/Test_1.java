import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by parvas on 30.01.2016.
 */
public class Test_1 {
    @Test
    public void testPlus()
    {
        int res= Calc.metodCalc(15, "+", 5);
        assertEquals(20, res);
    }
    @Test
    public void test_Minus()
    {
        int res=Calc.metodCalc(15, "-", 5);
        assertEquals(10, res);
    }
    @Test
    public void test_Multiply()
    {
        int res=Calc.metodCalc(15, "*", 5);
        assertEquals(75, res );
    }
    @Test
    public void test_Divide()
    {
        int res=Calc.metodCalc(15, "/", 5);
        assertEquals(3, res );
    }
}
