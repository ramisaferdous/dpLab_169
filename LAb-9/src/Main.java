public class Main {
    public static void main(String[] args) {

      Mediator mediator = new Mediator();
      mediator.Register();


      System.out.println("\nNotifying CurrentWaqt:");
      mediator.notify(mediator.currentWaqt);

      System.out.println("\nNotifying NextPrayer:");
      mediator.notify(mediator.nextPrayer);

      System.out.println("\nNotifying Location:");
      mediator.notify(mediator.location);

        System.out.println("\nNotifying Timezone:");
        mediator.notify(mediator.timezone);

    }
}