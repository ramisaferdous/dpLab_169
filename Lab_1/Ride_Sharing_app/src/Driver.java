

public class Driver extends User {

    public String vehicleType;
    public String availability;

    public PaymentMethod preferredPaymentMethod;
    private boolean available;
    public Driver(int id, String name,  Location location) {
        this.id = id;
        this.name = name;

        this.location = location;
        this.rating = 0; // Default rating is 0 initially
        this.available = true;
    }

    public void acceptRide(Trip trip){

    }
    public void rateUser(User user, double rating) {
        user.rating = (user.rating + rating) / 2.0;
    }

    public void startTrip(Trip trip){
        trip.start();
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }


    @Override
    public void updateLocation(Location new_Location) {
        this.location = new_Location;
    }
}




