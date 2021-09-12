package facade_pattern;

public class Taxes implements OrderProcess{
    public String type = "taxes";

    public String toString(){
        return type;
    }
}
