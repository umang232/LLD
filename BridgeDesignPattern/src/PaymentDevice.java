public abstract class PaymentDevice {

    public PaymentMethod paymentMethod;
    public PaymentDevice(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }
    abstract void makePayment(double amount);
}
