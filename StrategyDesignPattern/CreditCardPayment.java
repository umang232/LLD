public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("You would be paying through your card");
    }
}
