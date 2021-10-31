package factory_method.logistics_example.creator;

import factory_method.logistics_example.concrete_products.Transport;

public abstract class LogisticsApp {
    LogisticsApp() {};

    public void orderProduct(){
        Transport transport_type = getTransport();
        transport_type.deliver();
    }

    protected abstract Transport getTransport();

}
