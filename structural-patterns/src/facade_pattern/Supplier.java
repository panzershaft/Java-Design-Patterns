package facade_pattern;

public class Supplier implements OrderProcess{
    public String type = "Supplier";

    public String toString(){
        return type;
    }
}
