public abstract class Vehicle {
    private final String id;
    private final String make;
    private final String model;
    private final double dailyRate;
    private boolean isRented;

    public Vehicle(String id, String make, String model, double dailyRate) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.dailyRate = dailyRate;
        this.isRented = false;
    }

    public String getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public boolean isRented() {
        return isRented;
    }

    public void rent() {
        if (!isRented) {
            isRented = true;
        }
    }

    public void returnVehicle() {
        isRented = false;
    }

    public abstract double calculateRentalCost(int days);

    public String toString() {
        return String.format("%s %s (%s)", make, model, id);
    }
}