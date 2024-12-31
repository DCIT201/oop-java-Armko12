public class Main {
    public static void main(String[] args) {

        RentalAgency rentalAgency = new RentalAgency();

        Vehicle sedan = new Car("V100", "Honda", "Civic", 45.0);
        Vehicle sportsBike = new Motorcycle("V200", "Kawasaki", "Ninja 300", 35.0);
        Vehicle pickupTruck = new Truck("V300", "Chevrolet", "Silverado", 70.0);

        rentalAgency.addVehicle(sedan);
        rentalAgency.addVehicle(sportsBike);
        rentalAgency.addVehicle(pickupTruck);

        Customer alice = new Customer("C001", "Alice Johnson");
        Customer bob = new Customer("C002", "Bob Williams");

        rentalAgency.addCustomer(alice);
        rentalAgency.addCustomer(bob);

        System.out.println("Alice rents the Honda Civic for 4 days:");
        rentalAgency.processRental(sedan, alice, 4);

        System.out.println("\nBob rents the Kawasaki Ninja for 3 days:");
        rentalAgency.processRental(sportsBike, bob, 3);

        System.out.println("\nReturning the Honda Civic:");
        rentalAgency.returnVehicle(sedan);

        System.out.println("\nFinal Rental Transactions Report:");
        rentalAgency.generateReport();
    }
}