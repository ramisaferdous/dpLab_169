import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Driver driver = new Driver(1, "Maisha", null);  // No location at initialization
        Rider rider = new Rider(1, "Zahara", null, new CreditCardPayment("1234123412341234", "Jane Doe"));


        Trip trip = new Trip(rider, driver, RideType.Carpool);


        System.out.print("Enter Pickup Location: ");
        String pickupInput = scanner.nextLine();
        System.out.print("Enter Drop-off Location: ");
        String dropOffInput = scanner.nextLine();


        trip.setPickupLocation(new Location(pickupInput));
        trip.setDropOffLocation(new Location(dropOffInput));


        System.out.println("Pickup Location: " + trip.getPickupLocation());
        System.out.println("Drop-off Location: " + trip.getDropOffLocation());


        trip.startTrip();
        System.out.println("Trip Fare: " + trip.calculateFare());


        scanner.close();
    }
}
