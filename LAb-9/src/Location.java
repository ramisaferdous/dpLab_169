public class Location implements IWidget{
    public Location(Mediator mediator) {
        mediator.notify(this);
    }

    @Override
    public void update() {
        System.out.println("Location has been updated");
    }
}
