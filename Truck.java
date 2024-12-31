public class Truck extends Vehicle {
    public Truck(String id, String make, String model, double dailyRate) {
        super(id, make, model, dailyRate);
    }

    public double calculateRentalCost(int days) {
        return getDailyRate() * days * 1.2;
    }
}
