package factory_method.logistics_example.creator;

import factory_method.logistics_example.concrete_products.Transport;
import factory_method.logistics_example.concrete_products.Truck;

public class RoadLogistics extends LogisticsApp{
    @Override
    protected Transport getTransport() {
        return new Truck();
    }
}
