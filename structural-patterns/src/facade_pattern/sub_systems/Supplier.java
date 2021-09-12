package facade_pattern.sub_systems;

public class Supplier implements OrderProcess {
    public String type = "Supplier";

    public String toString(){
        return type;
    }
}
