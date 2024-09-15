

public class Driver {
    public int id;
    public String name;
    public String vehicleType;
    public Location location;
    public double rating;
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
    public void rateRider(Rider rider,double rating){

    }
    public void updateLocation( Location new_Location){
        this.location = new_Location;
    }
    public void startTrip(Trip trip){
        trip.start();

    }

    public void setAvailable(boolean available) {
        this.available = available;
    }


}




