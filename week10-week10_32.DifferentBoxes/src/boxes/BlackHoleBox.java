package boxes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BlackHoleBox extends Box{
    private Map <String, Integer> box;
    
    public BlackHoleBox() {
        this.box = new HashMap<String, Integer> ();    
    }

    @Override
    public void add(Thing thing) {
        this.box.put(thing.getName(), thing.getWeight());
    }

    @Override
    public void add(Collection<Thing> things) {
        super.add(things);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
    
}
