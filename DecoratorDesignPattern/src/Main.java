public class Main {
    public static void main(String[] args) {
        Coffee coffee1 = new SimpleCoffee();
        System.out.println(coffee1.getDescription());

        Coffee coffee2 = new Milk(new Americano());
        System.out.println(coffee2.getDescription());

        Coffee coffee3 = new Sugar(new Milk(new SimpleCoffee()));
        System.out.println(coffee3.getDescription());

        Coffee coffee4 = new Milk(new Sugar(new WhippedCream(new Americano())));
        System.out.println(coffee4.getDescription());
    }
}
