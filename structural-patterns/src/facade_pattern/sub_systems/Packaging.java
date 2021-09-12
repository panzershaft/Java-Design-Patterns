package facade_pattern.sub_systems;

public class Packaging implements OrderProcess {
    public String type = "Packaging";

    public String toString(){
        return type;
    }
}
