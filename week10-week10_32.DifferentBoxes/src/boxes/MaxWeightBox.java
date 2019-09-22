package boxes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MaxWeightBox extends Box {

    private int maxWeight;
    private Map<String, Integer> contents;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.contents = new HashMap<String, Integer>();
    }

    @Override
    public void add(Thing thing) {
        int contentWeight = 0;
        for (Integer weight : this.contents.values()) {
            contentWeight += weight;
        }
        if ((contentWeight + thing.getWeight()) <= this.maxWeight) {
            this.contents.put(thing.getName(), thing.getWeight());
        }
    }

    @Override
    public void add(Collection<Thing> things) {
        super.add(things);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if (this.contents.containsKey(thing.getName())) {
            return true;
        }
        return false;
    }
}
