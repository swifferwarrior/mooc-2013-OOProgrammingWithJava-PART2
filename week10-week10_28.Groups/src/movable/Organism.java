package movable;

public class Organism implements Movable {

    private int x;
    private int y;

    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int dx, int dy) {
        //moves the object as much as specified by arguments
        this.x += dx;
        this.y += dy;
    }
    
    @Override
    public String toString(){
        return "x: " + x + "; y: " + y;
    }
    
}
