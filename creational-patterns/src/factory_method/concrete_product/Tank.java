package factory_method.concrete_product;
/*

Interface

 */
public interface Tank {
    void accelerate(String tankName);
    void reverse(String tankName);
    void fire(String tankName);
    void halt(String tankName);
    void rotateTurret(String tankName);
}
