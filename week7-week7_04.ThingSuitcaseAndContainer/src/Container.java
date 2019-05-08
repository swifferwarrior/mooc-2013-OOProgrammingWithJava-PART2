
import java.util.ArrayList;

public class Container {

    private int maxWeightLimit;
    private ArrayList<Suitcase> cases = new ArrayList<Suitcase>();

    public Container(int maxWeightLimit) {
        this.maxWeightLimit = maxWeightLimit;
        this.cases = cases;
    }

    public void addSuitcase(Suitcase suitcase) {
        //adds the suitcase as a parameter to the container
        if ((totalWeight()+suitcase.totalWeight())<= this.maxWeightLimit)
        this.cases.add(suitcase);
    }

    public String toString() {
        //returns a string in the form "x suitcases (y kg)
        int x = 0;
        int y = 0;

        for (Suitcase suitcase : this.cases) {
            if ((y + suitcase.totalWeight()) <= this.maxWeightLimit) {
                x++;
                y += suitcase.totalWeight();
            }
        }

        if (x == 0) {
            return "empty (0 kg)";
        } else {
            return x + " suitcases (" + y + " kg)";
        }
    }

    public void printThings() {
        for (Suitcase ofThings : cases)  {
            ofThings.printThings();
        }
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        
        for ( Suitcase weighed : cases){
            totalWeight += weighed.totalWeight();
        }
        
        return totalWeight;
    }
    
}
