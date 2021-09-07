package factory_method;

public class GermanTank extends TankFactory{


    public GermanTank(String tankName, double mass, double length, double height, double width, int crew) {
        super(tankName, mass, length, height, width, crew);
    }

    @Override
    public Tank manufactureTank(String tankBuild) {
        if(tankBuild.equals("light")) return new LightTank();
        if(tankBuild.equals("heavy")) return new HeavyTank();
        else return null;
    }
    @Override
    public String toString(){
        System.out.println("----------------- STATS FOR GERMAN TANK  -------------");
        return super.toString() + "\n---------------------------------------------------------";
    }
}