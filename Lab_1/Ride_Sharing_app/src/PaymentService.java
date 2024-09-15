public class PaymentService {
    public void processTripPayment(Trip trip,PaymentMethod paymentMethod){
        double fare = trip.getFare();
        paymentMethod.processPayment(fare);
    }
}
