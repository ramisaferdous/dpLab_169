public class Timezone implements IWidget{
    public Timezone(Mediator mediator) {
        mediator.notify(this);
    }

    @Override
    public void update() {
        System.out.println("Timezone has been updated");
    }
}
