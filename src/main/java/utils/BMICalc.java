package utils;

import interfaces.BMICalculator;

public class BMICalc implements BMICalculator {

    private double weight;
    private double height;

    public BMICalc(double weight, double height) {
        if (weight < 0 || height < 0) throw (new IllegalArgumentException());
        this.weight = weight;
        this.height = height / 100;
    }

    public String calculate() {
        Double value = weight / (height * height);
        String value2 = String.format("%.1f", value);
        return value2.replaceAll(",", ".");
    }

    public String interpret() {
        String bmi = calculate();
        double bmi1 = Double.parseDouble(bmi);
        String result = null;

        double[] BMIIndex = {15, 16, 18.5, 25, 30, 35, 40, 45, 50, 60, 175};

        String[] BMILabel = {"Very severely underweight",
                "Severely underweight",
                "Underweight",
                "Normal (healthy weight)",
                "Overweight",
                "Obese Class I (Moderately obese)",
                "Obese Class II (Severely obese)",
                "Obese Class III (Very severely obese)",
                "Obese Class IV (Morbidly Obese)",
                "Obese Class V (Super Obese)",
                "Obese Class VI (Hyper Obese)"};
        for (int i = 0; i < BMIIndex.length; i++) {
            if (bmi1 <= BMIIndex[i]) {
                result = BMILabel[i];
                break;
            }
        }
        return result;
    }
}


