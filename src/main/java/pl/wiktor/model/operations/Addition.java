package pl.wiktor.model.operations;

public class Addition extends OperationAbstract {

    @Override
    public double execute(double currentResult, double operationNumber) {
        return currentResult + operationNumber;
    }
}
