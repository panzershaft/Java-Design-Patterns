package factory_method.concrete_product;

/*

Concrete Product

 */
public class LightTank implements Tank {
    private String name;

    public LightTank(String name){
        this.name = name;
    }

    @Override
    public void accelerate() {
        System.out.println(name + "-> accelerating");
    }

    @Override
    public void reverse() {
        System.out.println(name + "-> reversing");
    }

    @Override
    public void fire() {
        System.out.println(name + "-> FIRE THE CANNON!!!");
    }

    @Override
    public void halt() {
        System.out.println(name + "-> halting");
    }

    @Override
    public void rotateTurret() {
        System.out.println(name + "-> rotating the turret");
    }
}
