package factory_method.tanks_example.creator;

import factory_method.tanks_example.concrete_product.Tank;

/*

Creator class

 */
public abstract class TankFactory {
    private final String name;
    private final double length;
    private final double mass;
    private final double height;
    private final double width;
    private final int crew;

   public TankFactory(String tankName,  double mass, double length, double height,
                      double width,
                      int crew){
       this.name = tankName;
       this.mass = mass;
       this.length = length;
       this.height = height;
       this.width = width;
       this.crew = crew;
   }

    public void orderTank(String tankBuild){
        Tank prototype = manufactureTank(tankBuild);
        prototype.accelerate();
        prototype.reverse();
        prototype.fire();
        prototype.halt();
        prototype.rotateTurret();
    }
    public String getName() {
        return name;
    }
    public abstract Tank manufactureTank(String type);

    public String toString(){
        return "Tank name: " + name  +
                "\nMass: " + mass +
                "KG,\nHeight: " + height +
                " m,\nLength: " + length +
                " m,\nWidth: " + width +
                 " m,\nCrew size: " + crew;
    }
}
