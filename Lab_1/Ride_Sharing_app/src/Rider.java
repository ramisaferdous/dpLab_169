import javax.xml.stream.Location;

public class Rider {
    public int id;
    public String name;
    public Location location;
    public double rating;

    public PaymentMethod preferredPaymentMethod;
    public Rider(int id, String name, Location location, PaymentMethod preferredPaymentMethod) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.rating = 0;
        this.preferredPaymentMethod = preferredPaymentMethod;
    }
    public void requestRide(Location Location_pickup,Location Location_dropoff,RideType rideType){

    }
    public void rateDriver(Driver driver, double rating) {

    }
    public void makePayment(Trip trip) {
        PaymentService paymentService =new PaymentService();
        paymentService.processTripPayment(trip,preferredPaymentMethod);
    }
}