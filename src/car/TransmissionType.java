package car;

public enum TransmissionType {

    AUTO(1.3),
    MECHANIC(1.0),
    AI(2.0);

    private final double coefficientOfCost;

    TransmissionType(double coefficientOfCost) {
        this.coefficientOfCost = coefficientOfCost;
    }

    public double getCoefficientOfCost() {
        return coefficientOfCost;
    }

    public boolean isNotAI() {
        return !this.equals(AI);
    }

    public boolean isAutoOrMechanic() {
        return this.equals(AUTO) || this.equals(MECHANIC);
    }

    public boolean isAuto() {
        return this.equals(AUTO);
    }
}
