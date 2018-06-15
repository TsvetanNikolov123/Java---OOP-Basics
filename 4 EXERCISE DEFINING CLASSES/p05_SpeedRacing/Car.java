package p05_SpeedRacing;

public class Car {
    private static final int DEFAULT_DISTANCE_TRAVELLED = 0;

    private String model;
    private double fuel;
    private double costPerKilometer;
    private int distanceTravelled;

    public Car(String model, double fuel, double costPerKilometer) {
        this.model = model;
        this.fuel = fuel;
        this.costPerKilometer = costPerKilometer;
        this.distanceTravelled = DEFAULT_DISTANCE_TRAVELLED;
    }

    public void drive(int kilometers) {
        double fuelForDrive = kilometers * this.costPerKilometer;

        if (fuelForDrive > this.fuel){
            throw new IllegalStateException("Insufficient fuel for the drive");
        }

        this.distanceTravelled += kilometers;
        this.fuel -= fuelForDrive;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", this.model, this.fuel, this.distanceTravelled);
    }
}
