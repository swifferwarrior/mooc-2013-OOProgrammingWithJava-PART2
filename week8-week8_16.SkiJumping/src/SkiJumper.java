import java.util.List;
import java.util.ArrayList;

public class SkiJumper implements Comparable<SkiJumper> {
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
    
   public void printJumps(){
       System.out.print("jump lengths: "); 
       for (Jump round : jumps){
           if( round == jumps.get(jumps.size()-1)){
                break;
           }
           System.out.print(round.getJumpLength() + " m, ");                     //creating a new jump length, not reporting the old one
        }
        System.out.println(jumps.get(jumps.size()-1).getJumpLength() + " m");
    }

    @Override
    public String toString() {
        return "Jumper: " + this.name + "\n"
                + "Jumps: " + this.jumps;
    }
    
    @Override
    public int compareTo (SkiJumper jumper) {
        return this.totalPlayerPoints - jumper.getTotalPoints();
    /*
            if(this.totalPlayerPoints == jumper.getTotalPoints()){
                return 0;
            } else if (this.totalPlayerPoints > jumper.getTotalPoints()){
                return 1;
            } else {
                return -1;    
            }
    */
    }
}
