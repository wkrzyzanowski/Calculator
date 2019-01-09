package pl.wiktor.tool;

import pl.wiktor.model.Instruction;

import java.util.List;


public class Calculator {

    List<Instruction> instructionList;
    double startResult;


    public Calculator(List<Instruction> instructionList, double startResult) {
        this.instructionList = instructionList;
        this.startResult = startResult;
    }


    public double calculate() {
        instructionList.forEach(x -> startResult = x.getTask().execute(x.getNumber(), this.startResult));
        return this.startResult;
    }


}
