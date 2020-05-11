import interfaces.BMICalculator;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import utils.*;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class BMICalcTest {

    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "fakeValues")
    public void testConstruct(double weight, double height) {
        new BMICalc(weight, height);
    }

    @Test
    @Parameters(method = "rightValues")
    public void testCalculate(double weight, double height, String exp) {
        BMICalculator calc = new BMICalc(weight, height);
        assertEquals(exp, calc.calculate());
    }

    @Test
    @Parameters(method = "interpret")
    public void testInterpret(double weight, double height, String label) {
        BMICalculator calc = new BMICalc(weight, height);
        assertEquals(label, calc.interpret());
    }


    private Object[] fakeValues() {
        return new Object[]{
                new Object[]{-1.0, 170.0},
                new Object[]{1.0, -1.0},
                new Object[]{-50.0, -1.0}};

    }

    private Object[] rightValues() {
        return new Object[]{
                new Object[]{40, 120, "27.8"},
                new Object[]{50, 120, "34.7"}};

    }

    private Object[] interpret() {
        return new Object[]{
                new Object[]{30, 180, "Very severely underweight"},
                new Object[]{24, 125, "Severely underweight"},
                new Object[]{30, 130, "Underweight"},
                new Object[]{27, 120, "Normal (healthy weight)"},
                new Object[]{40, 120, "Overweight"},
                new Object[]{50, 120, "Obese Class I (Moderately obese)"},
                new Object[]{55, 120, "Obese Class II (Severely obese)"},
                new Object[]{60, 120, "Obese Class III (Very severely obese)"},
                new Object[]{70, 120, "Obese Class IV (Morbidly Obese)"},
                new Object[]{80, 120, "Obese Class V (Super Obese)"},
                new Object[]{120, 120, "Obese Class VI (Hyper Obese)"},
        };
    }
}