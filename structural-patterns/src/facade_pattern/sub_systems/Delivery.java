package facade_pattern.sub_systems;

public class Delivery implements OrderProcess {
    public String type = "Delivery";

    public String toString(){
        return type;
    }
}
