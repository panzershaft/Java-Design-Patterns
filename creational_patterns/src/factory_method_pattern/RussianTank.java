package factory_method_pattern;

public class RussianTank extends TankFactory{


    public RussianTank(String tankName, double mass, double length, double height, double width, int crew) {
        super(tankName, mass, length, height, width, crew);
    }

    @Override
    public Tank manufactureTank(String tankBuild) {
        if(tankBuild.equals("light")) return new LightTank();
        if(tankBuild.equals("heavy")) return new HeavyTank();
        else return null;
    }
}
