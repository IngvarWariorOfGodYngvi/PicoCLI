package utils;

import interfaces.FibonacciInterface;

import java.math.BigInteger;

public class Fibonacci implements FibonacciInterface {


    public String counter(int number) {
        String[] fibonacciTab = new String[number+2];
        if (number <= 1)
            return String.valueOf(number);
        else {
            fibonacciTab[0] = "0";
            fibonacciTab[1] = "1";
            for (int i = 2; i <= number; i++) {
                fibonacciTab[i] = String
                        .valueOf(new BigInteger(fibonacciTab[i - 1])
                                .add(new BigInteger(fibonacciTab[i - 2])));
            }
        }
        return fibonacciTab[number];
    }
}


