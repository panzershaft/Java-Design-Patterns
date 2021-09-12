package facade_pattern;

public class Delivery implements OrderProcess{
    public String type = "Delivery";

    public String toString(){
        return type;
    }
}
