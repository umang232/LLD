public class StandardService implements ShippingInterface{
    @Override
    public void shippingMethod() {
        System.out.println("It would take 5 days and total cost would be : $10");
    }
}
