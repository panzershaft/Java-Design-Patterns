package factory_method.creator;

import factory_method.concrete_product.Tank;

/*

Creator class

 */
public abstract class TankFactory {
    private String name;
    private double length;
    private double mass;
    private double height;
    private double width;
    private int crew;

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
