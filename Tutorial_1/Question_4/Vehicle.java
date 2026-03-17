package Tutorial_1.Question_4;

public abstract class Vehicle {
    private double maxSpeed;
    protected double currentSpeed;

    public Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public abstract void accelerate();

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void pedalToTheMetal () {
        while (currentSpeed < maxSpeed) {
            accelerate();
        }
    }
}

//no, we cannot create an object of the abstract class Vehicle because it contains an abstract method accelerate() that does not have an implementation. 