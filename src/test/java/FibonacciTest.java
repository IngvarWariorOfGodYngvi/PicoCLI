import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import utils.*;


import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)

public class FibonacciTest {

    @Test
    @Parameters(method = "rightValues")
    public void fibonacciCounterWithRightValuesTest(int number, String exp) {
        Fibonacci fib = new Fibonacci();
        assertEquals(exp, fib.counter(number));
    }

    private Object[] rightValues() {
        return new Object[]{
                new Object[]{0, "0"},
                new Object[]{1, "1"},
                new Object[]{2, "1"},
                new Object[]{3, "2"},
                new Object[]{4, "3"},
                new Object[]{5, "5"},
                new Object[]{6, "8"},
                new Object[]{7, "13"},
                new Object[]{8, "21"}};
    }
}