import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private final List<Vehicle> vehicles;
    private final List<Customer> customers;
    private final List<RentalTransaction> transactions;

    public RentalAgency() {
        vehicles = new ArrayList<>();
        customers = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void processRental(Vehicle vehicle, Customer customer, int days) {
        vehicle.rent();
        double rentalCost = vehicle.calculateRentalCost(days);
        RentalTransaction transaction = new RentalTransaction(vehicle, customer, days, rentalCost);
        transactions.add(transaction);
        System.out.println("Rental processed successfully.");
        System.out.println("Rental cost: $" + rentalCost);
    }

    public void returnVehicle(Vehicle vehicle) {
        vehicle.returnVehicle();
        System.out.println("Vehicle returned successfully.");
    }

    public void generateReport() {
        System.out.println("Rental Report:");
        for (RentalTransaction transaction : transactions) {
            System.out.println(transaction.toString());
        }
    }
}