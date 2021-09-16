package composite_pattern.BuildingComposite.leaf;

import composite_pattern.BuildingComposite.Interfaces.IStructure;

// leaf class
public class Room implements IStructure {
    public String name;

    public Room(String name) {
        this.name = name;
    }

    @Override
    public void enter() {
        System.out.println("Youve entered the " + name);
    }

    @Override
    public void exit() {
        System.out.println("Youve exited the " + name);
    }

    @Override
    public void location() {
        System.out.println("You are currently in " + name);
    }

    public String getName(){
        return name;
    }
}
