package facade_pattern.facade;

import facade_pattern.sub_systems.*;

public class ShopFacade {

    public void selectProduct(){
        System.out.println("Checking product availability");

        OrderProcess check_supply = new Supplier();
        System.out.println( check_supply + " has product:" + " available");

        OrderProcess check_in_warehouse = new Warehouse();
        System.out.println(check_supply + "'s product available in : "+check_in_warehouse);

    }

    public void orderProduct(){
        System.out.println("Purchase done");

        OrderProcess payment = new Payment();
        System.out.println(payment + " done");

        OrderProcess taxes = new Taxes();
        System.out.println("Tax calculated: " + taxes);

        OrderProcess packaging = new Packaging();
        System.out.println("Your order status: " + packaging);

        OrderProcess delivery = new Delivery();
        System.out.println("Your order status: Out for " + delivery);

    }
}
