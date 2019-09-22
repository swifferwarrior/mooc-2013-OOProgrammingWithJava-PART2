package dungeon;

public abstract class Character {

    private String name;
    private int over;
    private int down;

    public abstract void move();

    @Override
    public String toString() {
        return name + " " + coordinates();
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
    
    public String coordinates(){
        return over + " " + down;
    }
    
    public abstract boolean equals();

}
