public class PrayerTimeTable implements IWidget{
    public PrayerTimeTable(Mediator mediator) {
        mediator.notify(this);
    }

    @Override
    public void update() {
        System.out.println("PrayerTimeTable has been updated");
    }
}
