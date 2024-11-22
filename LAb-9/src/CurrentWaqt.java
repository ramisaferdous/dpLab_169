public class CurrentWaqt implements IWidget{
    public CurrentWaqt(Mediator mediator) {

        mediator.notify(this);
    }
    @Override
    public void update() {

            System.out.println("CurrentWaqt has been updated");

    }
}
