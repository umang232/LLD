public class DesktopDevice extends PaymentDevice{
    public DesktopDevice(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    @Override
    void makePayment(double amount) {
        System.out.println("Starting Payment through desktop device for : $"+amount);
        paymentMethod.pay();
    }
}
