import java.util.HashMap;

public class Fleet {
    private HashMap<String, Plane> planes;

    public Fleet() {
        this.planes = new HashMap <String, Plane>();
    }

    
    public void addPlane(String key, Plane plane){
        this.planes.put(key, plane);
    }
    
    public Plane getPlane(String key){
        if(planes.containsKey(key)){
            return this.planes.get(key);
        }
        
        return null;
    }
    
    
}
