import javax.xml.stream.Location;

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
    public Trip(Rider rider,Location pickupLocation,Location dropOffLocation,RideType rideType){
        this.rider=rider;
        this.pickupLocation=pickupLocation;
        this.dropOffLocation=dropOffLocation;
        this.rideType=rideType;
        this.status="pending";
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
    public double getFare() {
        return fare;
    }
    public void start(){
        this.status = "Trip started.";
    }
    public void completeTrip(String status) {
        this.status="completed";

    }
}
