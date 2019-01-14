package pl.wiktor.tool;

import pl.wiktor.model.InputInstructionPattern;
import pl.wiktor.model.PossibleActions;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class InputDataReaderAndFormatter {

    public InputDataReaderAndFormatter() {
    }

    private List<InputInstructionPattern> inputInstructionPatternList;
    private double startResult = 0;


    public List<InputInstructionPattern> readFromStdInput() {
        inputInstructionPatternList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        read(br);
        findStartResult();
        return inputInstructionPatternList;
    }

    public List<InputInstructionPattern> readFromFile(String fileName) throws IOException {
        inputInstructionPatternList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileName))));
        read(br);
        findStartResult();
        return inputInstructionPatternList;
    }

    private void read(BufferedReader br) {
        resolveBufferedInput.accept(br);
    }

    private Consumer<BufferedReader> resolveBufferedInput =
            reader -> reader.lines().parallel()
                    .forEach(line -> {
                        String[] tmp = line.split("\\s+");
                        inputInstructionPatternList.add(new InputInstructionPattern(convertAction(tmp[0].toUpperCase()), Double.valueOf(tmp[1])));
                    });

    private void findStartResult() {
        int lastIndex = this.inputInstructionPatternList.size() - 1;
        this.startResult = this.inputInstructionPatternList.get(lastIndex).getNumber();
        this.inputInstructionPatternList.remove(lastIndex);
    }


    private PossibleActions convertAction(String action) {
        PossibleActions actionEnum = null;

        for (PossibleActions tmp : PossibleActions.values()) {
            if (action.equals(tmp.getActionInputName())) {
                actionEnum = tmp;
                break;
            }
        }
        return actionEnum;
    }

    public double getStartResult() {
        return startResult;
    }

}
