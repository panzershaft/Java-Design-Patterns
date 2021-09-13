package composite_pattern.composite;

import composite_pattern.Interfaces.IStructure;

import java.util.ArrayList;

// Composite class
public class Housing implements IStructure {
    public ArrayList<IStructure> structures;
    private String address;

    public Housing(String address){
        this.structures = new ArrayList<>();
        this.address = address;
    }

    @Override
    public String getName() { return address; }

    public int addStructure(IStructure component){
        this.structures.add(component);
        return this.structures.size() - 1;
    }

    public IStructure getStructure(int componentNumber){
        return this.structures.get(componentNumber);
    }

    @Override
    public void enter() {
        System.out.println("Entered");
    }

    @Override
    public void exit() {
        System.out.println("Exited");
    }

    @Override
    public void location() {
        System.out.println("You are currently in " + this.getName() + ". It has");
        for (IStructure struct: this.structures)
            System.out.println(struct.getName());
    }


}
