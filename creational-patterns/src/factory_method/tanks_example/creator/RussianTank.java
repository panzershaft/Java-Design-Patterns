package factory_method.tanks_example.creator;

import factory_method.tanks_example.concrete_product.HeavyTank;
import factory_method.tanks_example.concrete_product.LightTank;
import factory_method.tanks_example.concrete_product.Tank;

public class RussianTank extends TankFactory {


    public RussianTank(String tankName, double mass, double length, double height, double width, int crew) {
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
        System.out.println("----------------- STATS FOR RUSSIAN TANK  -------------");
        return super.toString() + "\n-------------------------------------------------------";
    }
}
