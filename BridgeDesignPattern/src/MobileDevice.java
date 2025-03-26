public class MobileDevice extends PaymentDevice{
    public MobileDevice(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    @Override
    void makePayment(double amount) {
        System.out.println("Starting Payment through mobile device for : $"+amount);
        paymentMethod.pay();
    }
}
