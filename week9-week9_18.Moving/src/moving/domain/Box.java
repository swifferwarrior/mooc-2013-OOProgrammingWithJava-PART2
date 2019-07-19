/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Box implements Thing{
    private int maximumCapacity;
    private int volume;
    private List <Thing> box;
    

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.volume = 0;
        this.box = new ArrayList<Thing> ();
    }
    
    public boolean addThing (Thing thing){
        //adds an item which implements the interface Thing to the box
        //if it does not fit in the box, the method returns false, otherwise true
        //the box must store the things into a list
        
        if((this.volume + thing.getVolume()) > this.maximumCapacity){
            return false;
        }
        
        this.box.add(thing);
        this.volume += thing.getVolume();
        return true;
    }
    
    public int getVolume(){
        return this.volume;
    }
}
