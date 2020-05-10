import java.util.Scanner;
import utils.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("set Fibonacci");
        int input = scanner.nextInt();
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.counter(input));
        BMICalc bmiCalc = new BMICalc(70,170);
        System.out.println(bmiCalc.calculate() + " " + bmiCalc.interpret());

    }
}
