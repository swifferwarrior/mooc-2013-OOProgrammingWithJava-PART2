package farmsimulator;

import java.util.ArrayList;
import java.util.List;

public class Farm implements Alive {

    private String owner;
    private Barn barn;
    private List<Cow> cows;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }

    public String getOwner() {
        return owner;
    }

    public Barn getBarn() {
        return barn;
    }

    public List<Cow> getCows() {
        return cows;
    }
    
    public void addCow(Cow cow){
        this.cows.add(cow);
    }
    
    public void installMilkingRobot (MilkingRobot robot){
        barn.installMilkingRobot(robot);
    }

    @Override
    public void liveHour() {
        //makes all the cows of the farm live for an hour
        for (Cow cow : cows) {
            cow.liveHour();
        }
    }

    public void manageCows() {
        //call's Barn's method takeCareOf so that all cows are milked
        this.barn.takeCareOf(cows);
    }

    @Override
    public String toString() {
        String animals = "";
        if (cows.isEmpty()) {
            animals = "No cows.";
        } else {
            animals = "Animals:" + "\n";
            for (Cow cow : cows) {
                animals += "        " + cow.toString() + "\n";
            }
        }
        
        return "Farm owner: " + this.owner + "\n"
                + "Barn bulk tank: " + this.barn.getBulkTank() + "\n"
                + animals;
    }

}
