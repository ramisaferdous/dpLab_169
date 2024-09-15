public class Admin {
    private String id;
    private String name;
    public Admin(String id,String name){
        this.id=id;
        this.name=name;
    }
    public void manageDriver(Driver driver){
        driver.setAvailable(false);
        System.out.println("The driver is deactivated.");
    }
    public void viewTripHistory(Trip trip) {
        System.out.println("Viewing trip history" );
    }
}
