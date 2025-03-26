public class Main {
    public static void main(String[] args) {
        PaymentDevice paymentDevice = new MobileDevice(new UpiPayment());
        paymentDevice.makePayment(20.34);
        PaymentDevice paymentDevice1 = new DesktopDevice(new BankPayment());
        paymentDevice1.makePayment(34.34);
    }
}