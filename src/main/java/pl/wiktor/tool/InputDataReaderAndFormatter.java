package pl.wiktor.tool;

import pl.wiktor.model.Instruction;
import pl.wiktor.model.PossibleActions;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InputDataReaderAndFormatter {

    public InputDataReaderAndFormatter() {
    }

    private List<Instruction> instructionList;
    private double startResult = 0;


    public List<Instruction> readFromStdInput() throws IOException {
        instructionList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        read(br);
        findStartResult();
        return instructionList;
    }

    public List<Instruction> readFromFile(String fileName) throws IOException {
        instructionList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileName))));
        read(br);
        findStartResult();
        return instructionList;
    }

    private void read(BufferedReader br) throws IOException {
        String input;
        while ((input = br.readLine()) != null) {
            String[] tmp = input.split("\\s");
            instructionList.add(new Instruction(convertAction(tmp[0]), Double.valueOf(tmp[1])));
            if (tmp[0].toUpperCase().equals("APPLY")) {
                break;
            }
        }
    }


    private void findStartResult() {
        int lastIndex = this.instructionList.size() - 1;
        this.startResult = this.instructionList.get(lastIndex).getNumber();
        this.instructionList.remove(lastIndex);
    }


    private PossibleActions convertAction(String action) {
        PossibleActions actionEnum = null;
        switch (action) {
            case "ADD":
                actionEnum = PossibleActions.ADDITION;
                break;
            case "SUBTRACT":
                actionEnum = PossibleActions.SUBTRACTION;
                break;
            case "MULTIPLY":
                actionEnum = PossibleActions.MULTIPLICATION;
                break;
            case "DIVIDE":
                actionEnum = PossibleActions.DIVISION;
                break;
            case "MODULO":
                actionEnum = PossibleActions.MODULO;
                break;
            case "APPLY":
                actionEnum = PossibleActions.APPLY;
                break;
        }
        return actionEnum;
    }

    public double getStartResult() {
        return startResult;
    }

}
