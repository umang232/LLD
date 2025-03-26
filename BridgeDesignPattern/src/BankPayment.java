public class BankPayment extends PaymentMethod{

    @Override
    public void pay() {
        System.out.println("Paid through Bank Transfer");
    }

}

