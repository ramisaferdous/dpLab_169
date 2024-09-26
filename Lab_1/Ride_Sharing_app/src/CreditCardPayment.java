public class CreditCardPayment implements PaymentMethod{
    private String cardNumber;
    private String cardHolderName;


        public CreditCardPayment(String cardNumber, String cardHolderName) {
            this.cardNumber = cardNumber;
            this.cardHolderName = cardHolderName;

        }

    @Override
    public void processPayment(double amount) {

    }
}
