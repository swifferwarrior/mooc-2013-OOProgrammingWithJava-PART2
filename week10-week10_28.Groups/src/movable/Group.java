package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable{
    private List<Movable> group;

    public Group() {
        this.group = new ArrayList<Movable>();
    }
    
    
    public String toString(){
        String finalString = "";
        for (Movable object : group){
            Object organism = (Organism) object;
            finalString += organism.toString() + "\n";
        }
        return finalString;
    }
    
    public void addToGroup(Movable movable){
        //adds a new object which implements the interface Movable to the group
        this.group.add(movable);
    }
    
    public void move(int dx, int dy){
        for (Movable object : group){
            Organism organism = (Organism) object;
            organism.move(dx, dy);
        }
    }
}
