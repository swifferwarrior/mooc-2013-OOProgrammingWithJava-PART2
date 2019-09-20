package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {

        this.name = name;
        this.weight = weight;
        
        if (this.weight < 0){
            throw new IllegalArgumentException();
        }
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this ==  obj){
            return true;
        }
        
        if (obj == null){
            return false;
        }
        
        Thing thing = (Thing) obj;
        
        return (thing.name == this.name);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();

    }

}
