package pl.wiktor.tool;

import pl.wiktor.model.InputInstructionPattern;

import java.util.List;

import static pl.wiktor.tool.OperationFactory.getOperation;


public class Calculator {

    private List<InputInstructionPattern> inputInstructionPatternList;
    private double startResult;


    public Calculator(List<InputInstructionPattern> inputInstructionPatternList, double startResult) {
        this.inputInstructionPatternList = inputInstructionPatternList;
        this.startResult = startResult;
    }


    public double calculate() {
        inputInstructionPatternList.forEach(x ->
                startResult = OperationFactory.getOperation(x).execute(this.startResult, x.getNumber())
        );
        return this.startResult;
    }


}
