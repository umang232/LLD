public class Main {
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout();
        cart.setPaymentStrategy(new CashPayment());
        cart.checkout();
    }
}
