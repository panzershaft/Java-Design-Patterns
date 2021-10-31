package factory_method.tanks_example.client.concrete_product;

/*

Concrete Product

 */
public class HeavyTank implements Tank {
    private String name;

    public HeavyTank(String name){
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
        System.out.println(name + "... FIRE THE CANNON!!!");
    }

    @Override
    public void halt() {
        System.out.println(name + "-> halting");
    }

    @Override
    public void rotateTurret() {
        System.out.println(name + "-> Rotating the turret");
    }
}
