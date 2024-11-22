public class NextPrayer implements IWidget{
    public NextPrayer(Mediator mediator) {
        mediator.notify(this);
    }

    @Override
    public void update() {

            System.out.println("Next Prayer has been updated");

    }
}
