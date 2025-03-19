public class Main {
    public static void main(String[] args) {
        ShippingService shippingService = new ShippingService();
        shippingService.setShippingInterface(new StandardService());
        shippingService.checkout();

        ShippingService shippingService2 = new ShippingService(new OverNightService());
        shippingService2.checkout();
    }
}