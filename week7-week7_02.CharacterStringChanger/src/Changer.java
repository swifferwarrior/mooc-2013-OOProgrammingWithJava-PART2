
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
        String newCharacterString = "";

        for (Change edit : changeList) {
            newCharacterString = edit.change(characterString);
        }

        return newCharacterString;
    }

}
