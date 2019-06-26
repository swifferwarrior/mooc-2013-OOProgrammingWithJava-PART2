import java.util.List;
import java.util.ArrayList;

public class SkiJumper {
    private String name;
    private List <Jump> jumps;
    private int totalPoints;

    public SkiJumper(String name) {
        this.name = name;
        this.jumps = new ArrayList<Jump>();
        this.totalPoints = 0;
    }
    
    public void addJump(Jump jump){
        this.jumps.add(jump);
    }

    public List<Jump> getJumps() {
        return jumps;
    }

    public int getTotalPoints() {
        int sum = 0;
        for (Jump iteration : jumps){
            sum += iteration.getTotalJumpScore();
        }
        this.totalPoints = sum;
        return this.totalPoints;
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
