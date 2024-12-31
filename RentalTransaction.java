public class RentalTransaction {
    private final Vehicle vehicle;
    private final Customer customer;
    private final int rentalDays;
    private final double rentalCost;

    public RentalTransaction(Vehicle vehicle, Customer customer, int rentalDays, double rentalCost) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDays = rentalDays;
        this.rentalCost = rentalCost;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public String toString() {
        return String.format("%s rented by %s for %d days. Cost: $%.2f",
                vehicle.toString(), customer.getName(), rentalDays, rentalCost);
    }
}
