
public class Trip {
    public int id;
    public Location pickupLocation;
    public RideType rideType;
    public Location dropOffLocation;
    public double fare;
    public String status;
    public double distance;
    public Driver driver;
    public Rider rider;
    public Trip(Rider rider,Driver driver,RideType rideType){
        this.rider=rider;
        this.driver=driver;
        this.rideType=rideType;
        this.status="pending";
    }




    public Location getPickupLocation() {
        return pickupLocation;
    }
    public void setPickupLocation(Location pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public Location getDropOffLocation() {
        return dropOffLocation;
    }
    public void setDropOffLocation(Location dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    }

    public double calculateFare() {
        double baseFare=10.0;
        double perkmRate=rideType==RideType.Luxury?2.5:rideType==RideType.Carpool?1.0:1.5;
        return baseFare+(perkmRate * distance);

    }
    public void assignDriver(Driver driver){
        this.driver=driver;
        this.status="completed";


    }
    public void startTrip() {
        this.status = "Trip started.";
    }
    public double getFare() {
        return fare;
    }//it should depend on ride type,pickup,drop off
    public void start(){
        this.status = "Trip started.";
    }
    public void completeTrip(String status) {
        this.status="completed";

    }


}
