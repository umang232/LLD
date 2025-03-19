public class CashPayment implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("You would be paying through cash on delivery");
    }
}
