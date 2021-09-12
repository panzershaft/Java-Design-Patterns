package facade_pattern.sub_systems;

public class Taxes implements OrderProcess {
    public String type = "taxes";

    public String toString(){
        return type;
    }
}
