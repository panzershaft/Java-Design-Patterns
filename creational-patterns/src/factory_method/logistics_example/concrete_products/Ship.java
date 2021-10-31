package factory_method.logistics_example.concrete_products;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivering through Ship... via the Suez Canal :)");
    }
}
