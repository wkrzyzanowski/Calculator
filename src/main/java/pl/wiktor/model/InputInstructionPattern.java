package pl.wiktor.model;

public class InputInstructionPattern {

    private PossibleActions task;
    private double number;

    public InputInstructionPattern(PossibleActions task, double number) {
        this.task = task;
        this.number = number;
    }

    public PossibleActions getTask() {
        return task;
    }

    public void setTask(PossibleActions task) {
        this.task = task;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return "InputInstructionPattern{" +
                "task='" + task + '\'' +
                ", number=" + number +
                '}';
    }
}
