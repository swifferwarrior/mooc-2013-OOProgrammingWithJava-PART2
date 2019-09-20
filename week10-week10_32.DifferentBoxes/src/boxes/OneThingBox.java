/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class OneThingBox extends Box{
    private Map <String, Integer> box;
    
    public OneThingBox() {
        this.box = new HashMap <String, Integer>();
    }

    @Override
    public void add(Thing thing) {
        //if the box already contains something, can't add more
        if (this.box.isEmpty()){
            this.box.put(thing.getName(), thing.getWeight());
        } else {
           //*crickets*
        }
    }

    @Override
    public void add(Collection<Thing> things) {
        super.add(things);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if (this.box.containsKey(thing.getName())) {
            return true;
        }
        return false;
    }
    
}
