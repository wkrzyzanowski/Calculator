package pl.wiktor;

import org.junit.Before;
import org.junit.Test;
import pl.wiktor.tool.Calculator;
import pl.wiktor.tool.InputDataReaderAndFormatter;

import java.io.FileInputStream;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class InputReaderTest {

    private InputDataReaderAndFormatter inputDataReaderAndFormatter;

    @Before
    public void initialize() {
        inputDataReaderAndFormatter = new InputDataReaderAndFormatter();
    }


    @Test
    public void testStdInput() throws IOException {
        System.out.println("TEST READ FROM STD INPUT STREAM");
        System.setIn(new FileInputStream("TEST_FILES/TEST1.txt"));
        double result = new Calculator(inputDataReaderAndFormatter.readFromStdInput(), inputDataReaderAndFormatter.getStartResult()).calculate();
        assertEquals(Double.valueOf(result), Double.valueOf(4.0));
    }

    @Test
    public void testFileInput() throws IOException {
        System.out.println("TEST READ FROM FILE");
        double result = new Calculator(inputDataReaderAndFormatter.readFromFile("TEST_FILES/TEST1.txt"), inputDataReaderAndFormatter.getStartResult()).calculate();
        assertEquals(Double.valueOf(result), Double.valueOf(4.0));
    }
}
