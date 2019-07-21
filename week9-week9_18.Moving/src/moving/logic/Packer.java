package moving.logic;

import java.util.List;
import java.util.ArrayList;
import moving.domain.Thing;
import moving.domain.Box;

public class Packer {
    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume; //determines how big boxes the packer should use
    }
    
    public List<Box> packThings (List<Thing> things){
        //packs everything in the parameter List into boxes.
        //boxes should be contained by the list the method returns
        List<Box> boxes = new ArrayList<Box>();
        
        for (Thing thing : things){
            Box box = new Box(boxesVolume); //creates new box with specified volume
            box.addThing(thing); //adds things to the Box
            boxes.add(box); //adds box to list of boxes
        }
        
        return boxes;
    }
    
}
