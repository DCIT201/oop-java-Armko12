public class Car extends Vehicle {
    public Car(String id, String make, String model, double dailyRate) {
        super(id, make, model, dailyRate);
    }

    public double calculateRentalCost(int days) {
        return getDailyRate() * days;
    }
}