package moving.domain;

import java.util.List;
import java.util.ArrayList;

public class Box implements Thing {

    private int maximumCapacity;
    private List<Thing> box;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.box = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing) {
        //adds an item, which implements the interface Thing, to the box
        //if it does not fit in the box, the method returns false, otherwise true
        //the box must store the things into a list

        if ((this.getVolume() + thing.getVolume()) > this.maximumCapacity) {
            return false;
        }
        
        this.box.add(thing);
        return true;
    }

    @Override
    public int getVolume() {
        int volume = 0;

        for (Thing thing : box) {
            volume += thing.getVolume();
        }

        return volume;
    }
}

/* POST-SUBMIT NOTES */
 /*
1. NO REDUNDANT VARIABLES 
        Problem: 'Run Test' failed since 'volume' variable was instantiated despite getVolume needing to be implemented.
        Solution: Override the getVolume method and instantiate within it rather than the constructor.
 */
