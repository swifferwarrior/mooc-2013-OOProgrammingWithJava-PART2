package dungeon;

import java.util.Random;

public class Vampire extends Character{
    private String name;
    private Integer over;
    private Integer down;
    private Random random = new Random();

    public Vampire() {
        this.name = "v";
        //this.over = random;
        //this.down = random;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void setOver() {
        this.over = random.nextInt();
    }

    public void setDown() {
        this.down = random.nextInt();
    }

    @Override
    public String coordinates() {
        return super.coordinates();
    }

    @Override
    public void move() {
        //Randomize coordinates
        //If someone in there, re-roll
        
    }
    
    public void rollCoordinates(){
        //Randomize coordinates
    }
    
}

/*        @Override
    public boolean equals(Object obj) {
        //If objects are the same...
        if (this == obj) {
            return true;
        }

        //If object doesn't exist
        if (obj == null) {
            return false;
        }
        
        //Type setting
        Character char = (Character) obj;

        return (char.name == this.name);
    }*/