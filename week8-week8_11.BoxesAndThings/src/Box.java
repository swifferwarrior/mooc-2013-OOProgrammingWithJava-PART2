
import java.util.ArrayList;

public class Box implements ToBeStored{

    private final double MAXIMUM_WEIGHT;
    private ArrayList<ToBeStored> things;

    public Box(double MAXIMUM_WEIGHT) {
        this.MAXIMUM_WEIGHT = MAXIMUM_WEIGHT;
        this.things = new ArrayList<ToBeStored>();
    }

    public double weight() {
        //calculated as needed rather than stored in box variable since a getWeight()
            //method would need to calculate the weight from the array anyway.
        double weight = 0.0;

        for (ToBeStored thing : things) {
            weight += thing.weight();
        }

        return weight;
    }

    public void add(ToBeStored thing) {
        if ((this.weight() + thing.weight()) <= this.MAXIMUM_WEIGHT) {
            things.add(thing);
        }
    }

    @Override
    public String toString() {
        return "Box: " + this.things.size() + " things, total weight " + this.weight() + " kg";
    }
    
    
}
