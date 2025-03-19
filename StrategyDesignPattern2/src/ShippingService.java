public class ShippingService {
    private ShippingInterface shippingInterface;

    public ShippingService(){

    }

    public ShippingService(ShippingInterface shippingInterface){
        this.shippingInterface = shippingInterface;
    }
    public void setShippingInterface(ShippingInterface shippingInterface) {
        this.shippingInterface = shippingInterface;
    }

    public void checkout(){
        shippingInterface.shippingMethod();
    }
}
