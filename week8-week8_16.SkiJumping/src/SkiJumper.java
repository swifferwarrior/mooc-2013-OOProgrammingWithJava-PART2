//NOTE - SkiJumper must be saved as HashMap <String, Jump>
import java.util.List;
import java.util.ArrayList;

public class SkiJumper {
    private String name;
    private List <Jump> jumps;
    private int totalPlayerPoints;

    public SkiJumper(String name) {
        this.name = name;
        this.jumps = new ArrayList<Jump>();
        this.totalPlayerPoints = 0;
    }

    public String getName() {
        return this.name;
    }

/*    public int getTotalPlayerPoints() {
        return this.totalPlayerPoints;
    }*/
    
    public void addJump(Jump jump){
        this.jumps.add(jump);
    }

    public int getTotalPoints() {
        int sum = 0;
        for (Jump iteration : jumps){
            sum += iteration.getTotalJumpScore();
        }
        this.totalPlayerPoints = sum;
        return this.totalPlayerPoints;
    }
    
    public Jump getJump(int index){
        return this.jumps.get(index);
    }
    
    public void printJumps(){                               //make this return a String
        for (Jump iteration : jumps){
            System.out.println(iteration.jumpLength());
        }
    }

    @Override
    public String toString() {
        return "Jumper: " + this.name + "\n"
                + "Jumps: " + printJumps();
    }
    
    
}
