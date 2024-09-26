
public class Rider extends User{
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

    public void makePayment(Trip trip) {
        PaymentService paymentService =new PaymentService();
        paymentService.processTripPayment(trip,preferredPaymentMethod);
    }

    @Override
    public void updateLocation(Location new_Location) {
        this.location = new_Location;
    }

    @Override
    public void rateUser(User user, double rating) {
        user.rating = (user.rating + rating) / 2.0;
    }
}