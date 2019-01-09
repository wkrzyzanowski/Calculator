package pl.wiktor;

import org.junit.Before;
import org.junit.Test;
import pl.wiktor.tool.Calculator;
import pl.wiktor.tool.InputDataReaderAndFormatter;

import java.io.IOException;

import static org.junit.Assert.assertEquals;


public class CalcTest {


    private Calculator calculator;
    private InputDataReaderAndFormatter inputDataReaderAndFormatter;

    @Before
    public void initialize() {
        inputDataReaderAndFormatter = new InputDataReaderAndFormatter();
    }


    @Test
    public void calculationTest1() {
        try {
            System.out.println("ADD 1.0, SUBTRACT 2.0, ADD 1.0, APPLY 1.0");
            calculator = new Calculator(inputDataReaderAndFormatter.readFromFile("TEST.txt"), inputDataReaderAndFormatter.getStartResult());
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals("TEST1.txt", Double.valueOf(4.0), Double.valueOf(calculator.calculate()));
    }


}
