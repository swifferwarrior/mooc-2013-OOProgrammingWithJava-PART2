
import java.util.ArrayList;

public class Changer {

    private ArrayList<Change> changeList = new ArrayList<Change>();

    public Changer() {
        this.changeList = new ArrayList<Change>();
    }

    public void addChange(Change change) {
        //adds a new change to the Changer
        this.changeList.add(change);
    }

    public String change(String characterString) {
        //executes all added Changes for the character string in the order of 
        //their adding and returns the changed character string
        String newCharacterString = characterString;

        for (Change edit : changeList) {
            newCharacterString = edit.change(newCharacterString);
        }

        return newCharacterString;
    }

}

/* POST-SUBMIT NOTES */
/*
1. CHANGE() METHOD
        Instead of initializing newCharacterString as a blank string, set it
        to characterString so that it can be fed through the for() loop. Also,
        for each occurence of the loop, it should change the very same
        newCharacterString which is within the method. Changing characterString
        changes a variable outside the method and will not persist.
*/
