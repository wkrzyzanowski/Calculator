package pl.wiktor;

import pl.wiktor.tool.Calculator;
import pl.wiktor.tool.InputDataReaderAndFormatter;

import java.io.IOException;


public class StartApp {
    public static void main(String[] args) {

        InputDataReaderAndFormatter inputDataReaderAndFormatter = new InputDataReaderAndFormatter();
        Calculator calculator;
        try {
            calculator = new Calculator(inputDataReaderAndFormatter.readFromStdInput(), inputDataReaderAndFormatter.getStartResult());
            double result = calculator.calculate();
            System.out.printf("%s\n", result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
