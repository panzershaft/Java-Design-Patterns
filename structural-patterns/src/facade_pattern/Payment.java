package facade_pattern;

public class Payment implements OrderProcess{
    public String type = "payment";

    public String toString(){
        return type;
    }
}
