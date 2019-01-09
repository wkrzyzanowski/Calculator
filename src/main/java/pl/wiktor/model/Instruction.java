package pl.wiktor.model;

public class Instruction {

    private PossibleActions task;
    private double number;

    public Instruction(PossibleActions task, double number) {
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
        return "Instruction{" +
                "task='" + task + '\'' +
                ", number=" + number +
                '}';
    }
}
