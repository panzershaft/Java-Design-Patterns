package facade_pattern;

public class Warehouse implements OrderProcess{
    public String type = "Warehouse";

    public String toString(){
        return type;
    }
}
