public class WaqtTimeTable implements IWidget{
    public WaqtTimeTable(Mediator mediator) {
        mediator.notify(this);
    }

    @Override
    public void update() {
        System.out.println("WaqtTimeTable has been updated");
    }}