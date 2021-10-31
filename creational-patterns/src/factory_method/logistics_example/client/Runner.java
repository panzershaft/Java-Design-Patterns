package factory_method.logistics_example.client;

import factory_method.logistics_example.creator.LogisticsApp;
import factory_method.logistics_example.creator.RoadLogistics;
import factory_method.logistics_example.creator.SeaRoute;

public class Runner {
    public static void main(String[] args){
        LogisticsApp land_route = new RoadLogistics();
        LogisticsApp sea_route= new SeaRoute();

        land_route.orderProduct();
        sea_route.orderProduct();
    }
}
