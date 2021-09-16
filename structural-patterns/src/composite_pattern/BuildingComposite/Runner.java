package composite_pattern.BuildingComposite;

import composite_pattern.BuildingComposite.composite.Housing;
import composite_pattern.BuildingComposite.leaf.Room;

public class Runner {
    public static void main(String[] args){
        Housing building = new Housing("123 Street");
        Housing floor1 = new Housing("123 Street - 1st floor");
        int firstFloor = building.addStructure(floor1);

        Room washroom1m = new Room("1F Men's Washroom");
        Room washroom1w = new Room("1F Women's Washroom");
        Room common1 = new Room("1F Common Area");

        int firstMens = floor1.addStructure(washroom1m);
        int firstWomans = floor1.addStructure(washroom1w);
        int firstCommon = floor1.addStructure(common1);

        building.enter();
        Housing currentfloor = (Housing) building.getStructure(firstFloor);
        currentfloor.enter();

        Room currentRoom = (Room) currentfloor.getStructure(firstMens);
        currentRoom.enter();
        currentRoom = (Room) currentfloor.getStructure(firstCommon);
        currentRoom.enter();
    }
}
