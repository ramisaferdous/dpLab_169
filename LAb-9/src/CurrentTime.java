public class CurrentTime implements IWidget{
    public CurrentTime(Mediator mediator) {
    mediator.notify(this);
    }

    @Override
    public void update() {
        System.out.println("CurrentTime has been updated");
    }
}
