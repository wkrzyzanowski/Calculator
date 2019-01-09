package pl.wiktor.model;


public enum PossibleActions {
    ADDITION {
        @Override
        public double execute(double instructionNumber, double currentResult) {
            return currentResult + instructionNumber;
        }
    },
    SUBTRACTION {
        @Override
        public double execute(double instructionNumber, double currentResult) {
            return currentResult - instructionNumber;
        }
    },
    DIVISION {
        @Override
        public double execute(double instructionNumber, double currentResult) {
            return currentResult / instructionNumber;
        }
    },
    MULTIPLICATION {
        @Override
        public double execute(double instructionNumber, double currentResult) {
            return currentResult * instructionNumber;
        }
    },
    MODULO {
        @Override
        public double execute(double instructionNumber, double currentResult) {
            return currentResult % instructionNumber;
        }
    },
    APPLY {
        @Override
        public double execute(double instructionNumber, double currentResult) {
            return 0;
        }
    };


    public abstract double execute(double instructionNumber, double currentResult);
}
