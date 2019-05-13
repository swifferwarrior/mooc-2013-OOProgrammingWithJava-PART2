
import java.util.ArrayList;

public class Suitcase {

    private int maxWeightLimit;
    private ArrayList<Thing> things = new ArrayList<Thing>();

    public Suitcase(int maxWeightLimit) {
        this.maxWeightLimit = maxWeightLimit;
        this.things = new ArrayList<Thing>();
    }

    public void addThing(Thing thing) {
        //adds the thing in the parameter to your suitcase
        if(totalWeight()+thing.getWeight()<= this.maxWeightLimit)
        this.things.add(thing);
    }

    public String toString() {
        //returns a string int he form of "x things (y kg)"
        int x = 0;
        int y = 0;

        for (Thing item : things) {
            if ((y + item.getWeight()) <= this.maxWeightLimit) {
                x++;
                y += item.getWeight();
            }
        }

        if (x == 0) {
            return "empty (0 kg)";
        } else if (x == 1) {
            return "1 thing (" + y + " kg)";
        } else {
            return x + " things (" + y + " kg)";
        }

    }

    public void printThings() {
        //prints out all the things inside the suitcase
        for (Thing thing : this.things) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        //returns the total weight of the things in your suitcase
        int totalWeight = 0;

        for (Thing thing : this.things) {
            totalWeight += thing.getWeight();
        }

        return totalWeight;
    }

    public Thing heaviestThing() {
        if (this.things.isEmpty()) {
            return null;
        }

        Thing heaviest = this.things.get(0);

        for (Thing compared : this.things) {
            if (compared.getWeight() > heaviest.getWeight()) {
                heaviest = compared;
            }
        }

        return heaviest;
    }
}

/* POST-SUBMIT NOTES */
 /*
1. DON'T EXCEED MAX LIMIT
        It is not enough to check that "Y" is less than max weight. You must make
        sure that "y + item to be added" won't go over the limit before adding it.

2. HEAVIEST THING
        Check if it is things.isEmpty() first. Then start with the first Thing
        which is this.things.get(index 0) and compare with each successive item
        in the list. If it's bigger, replace the "heaviest" variable.

 */
