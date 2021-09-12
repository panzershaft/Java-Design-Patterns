package factory_method.concrete_product;

/*

Concrete Product

 */
public class HeavyTank implements Tank {
    @Override
    public void accelerate( String tankName) {
        System.out.println(tankName + " accelerating");
    }

    @Override
    public void reverse( String tankName) {
        System.out.println(tankName + " reversing");
    }

    @Override
    public void fire( String tankName) {
        System.out.println(tankName + "... FIRE THE CANNON!!!");
    }

    @Override
    public void halt( String tankName) {
        System.out.println(tankName + " halting");
    }

    @Override
    public void rotateTurret( String tankName) {
        System.out.println(tankName + "Rotating the turret");
    }
}
