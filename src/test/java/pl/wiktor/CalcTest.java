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
            calculator = new Calculator(inputDataReaderAndFormatter.readFromFile("TEST_FILES/TEST1.txt"), inputDataReaderAndFormatter.getStartResult());
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals("TEST1.txt", Double.valueOf(4.0), Double.valueOf(calculator.calculate()));
    }

    @Test
    public void calculationTest2() {
        try {
            System.out.println("APPLY 1.0");
            calculator = new Calculator(inputDataReaderAndFormatter.readFromFile("TEST_FILES/TEST2.txt"), inputDataReaderAndFormatter.getStartResult());
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals("TEST2.txt", Double.valueOf(1.0), Double.valueOf(calculator.calculate()));
    }

    @Test
    public void calculationTest3() {
        try {
            System.out.println("ADD 2.0, MULTIPLY 2.0, DIVIDE 5.0, MODULO 3.0 APPLY 8.0");
            calculator = new Calculator(inputDataReaderAndFormatter.readFromFile("TEST_FILES/TEST3.txt"), inputDataReaderAndFormatter.getStartResult());
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals("TEST3.txt", Double.valueOf(1.0), Double.valueOf(calculator.calculate()));
    }

    @Test
    public void calculationTest4() {
        try {
            System.out.println("ADD 2.0, MULTIPLY 3.0, APPLY 10.0");
            calculator = new Calculator(inputDataReaderAndFormatter.readFromFile("TEST_FILES/TEST4.txt"), inputDataReaderAndFormatter.getStartResult());
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals("TEST4.txt", Double.valueOf(36.0), Double.valueOf(calculator.calculate()));
    }

    @Test
    public void calculationTest5() {
        try {
            System.out.println("MULTIPLY 3.0, ADD 2.0, APPLY 10.0");
            calculator = new Calculator(inputDataReaderAndFormatter.readFromFile("TEST_FILES/TEST5.txt"), inputDataReaderAndFormatter.getStartResult());
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals("TEST5.txt", Double.valueOf(32.0), Double.valueOf(calculator.calculate()));
    }

}
