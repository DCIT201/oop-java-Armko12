public class Motorcycle extends Vehicle {
    public Motorcycle(String id, String make, String model, double dailyRate) {
        super(id, make, model, dailyRate);
    }

    public double calculateRentalCost(int days) {
        return getDailyRate() * days * 0.8;
    }
}