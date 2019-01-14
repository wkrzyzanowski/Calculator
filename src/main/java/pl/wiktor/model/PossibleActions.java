package pl.wiktor.model;


public enum PossibleActions {
    ADDITION("ADD"),
    SUBTRACTION("SUBTRACT"),
    DIVISION("DIVIDE"),
    MULTIPLICATION("MULTIPLY"),
    MODULO("MODULO"),
    APPLY("APPLY");

    private String actionInputName;

    PossibleActions(String action) {
        this.actionInputName = action;
    }

    public String getActionInputName() {
        return actionInputName;
    }
}
