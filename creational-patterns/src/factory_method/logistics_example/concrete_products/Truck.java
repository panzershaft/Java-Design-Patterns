package factory_method.logistics_example.concrete_products;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivering through Trucks");
    }
}
