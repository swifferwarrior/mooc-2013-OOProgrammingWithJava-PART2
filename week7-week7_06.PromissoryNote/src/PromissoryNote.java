
import java.util.HashMap;

public class PromissoryNote {

    private HashMap<String, Double> notesList;

    public PromissoryNote() {
        this.notesList = new HashMap<String, Double>();
    }

    public void setLoan(String toWhom, double value) {
        //stores the information about loans to specific people
        this.notesList.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose) {
        //returns the entity of the debt held by the parameter "person"
        if (this.notesList.containsKey(whose)) {
            return this.notesList.get(whose);
        }
        return 0;
    }
}
