package pl.wiktor.tool;

import pl.wiktor.model.InputInstructionPattern;
import pl.wiktor.model.operations.OperationAbstract;
import pl.wiktor.model.operations.*;

public class OperationFactory {

    static OperationAbstract getOperation(InputInstructionPattern inputInstructionPattern) {

        OperationAbstract operationAbstract = null;

        switch (inputInstructionPattern.getTask()) {
            case ADDITION:
                operationAbstract = new Addition();
                break;
            case SUBTRACTION:
                operationAbstract = new Subtraction();
                break;
            case MULTIPLICATION:
                operationAbstract = new Multiplication();
                break;
            case DIVISION:
                operationAbstract = new Division();
                break;
            case MODULO:
                operationAbstract = new Modulo();
                break;
            case APPLY:
                operationAbstract = new Apply();
                break;
        }

        return operationAbstract;
    }


}
