package facade_pattern.sub_systems;

public class Payment implements OrderProcess {
    public String type = "payment";

    public String toString(){
        return type;
    }
}
