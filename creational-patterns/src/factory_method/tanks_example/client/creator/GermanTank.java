package factory_method.tanks_example.client.creator;

import factory_method.tanks_example.client.concrete_product.HeavyTank;
import factory_method.tanks_example.client.concrete_product.LightTank;
import factory_method.tanks_example.client.concrete_product.Tank;

public class GermanTank extends TankFactory {


    public GermanTank(String tankName, double mass, double length, double height, double width, int crew) {
        super(tankName, mass, length, height, width, crew);
    }

    @Override
    public Tank manufactureTank(String tankBuild) {
        if(tankBuild.equals("light")) return new LightTank(super.getName());
        if(tankBuild.equals("heavy")) return new HeavyTank(super.getName());
        else return null;
    }
    @Override
    public String toString(){
        System.out.println("----------------- STATS FOR GERMAN TANK  -------------");
        return super.toString() + "\n---------------------------------------------------------";
    }
}
