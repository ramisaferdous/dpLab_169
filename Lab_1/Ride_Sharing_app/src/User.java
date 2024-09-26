

public abstract class User {
    public int id;
    public String name;
    public Location location;
    public double rating;


    public abstract void updateLocation(Location new_Location);

    public abstract void rateUser(User user, double rating);
}
