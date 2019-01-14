package pl.wiktor;

import pl.wiktor.tool.Calculator;
import pl.wiktor.tool.InputDataReaderAndFormatter;

import java.util.Locale;


public class StartApp {
    public static void main(String[] args) {

        InputDataReaderAndFormatter inputDataReaderAndFormatter = new InputDataReaderAndFormatter();
        Calculator calculator;

            calculator = new Calculator(inputDataReaderAndFormatter.readFromStdInput(), inputDataReaderAndFormatter.getStartResult());
            double result = calculator.calculate();
            System.out.printf("%s\n", String.format(Locale.US, "%.2f", result));


    }
}
