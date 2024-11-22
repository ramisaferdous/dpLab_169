public class PrayertimeSettings implements IWidget{
    public PrayertimeSettings(Mediator mediator) {
        mediator.notify(this);
    }

    @Override
    public void update() {
        System.out.println("PrayerTimeSettings has been updated");
    }
}
