package facade_pattern.sub_systems;

public class Warehouse implements OrderProcess {
    public String type = "Warehouse";

    public String toString(){
        return type;
    }
}
