package factory_method.logistics_example.creator;

import factory_method.logistics_example.concrete_products.Ship;
import factory_method.logistics_example.concrete_products.Transport;

public class SeaRoute extends LogisticsApp{
    @Override
    protected Transport getTransport() {
        return new Ship();
    }
}
