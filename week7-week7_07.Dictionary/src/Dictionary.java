
import java.util.HashMap;
import java.util.ArrayList;

public class Dictionary {

    private HashMap<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<String, String>();
    }

    public String translate(String word) {
        //returns the translation of it's parameter. If it's unknown, returns null.
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }
            return null;
    }

    public void add(String word, String translation) {
        //adds a new trasnlation in the dictionary
        this.dictionary.put(word, translation);
    }
    
    public int amountOfWords(){
        //returns the amount of words in the dictionary;
        return this.dictionary.size();
    }
    
    public ArrayList<String> translationList(){
        //returns strings which stand for a content list of your dictionary in
        //the form of key=value
        ArrayList<String> list = new ArrayList<String>();
        
        for (String key : dictionary.keySet()){
            list.add( key + " = " + this.dictionary.get(key));
        }
        return list;   
    }
}

/* POST-SUBMIT NOTES */ 
/*
1. AMOUNT OF WORDS METHOD
        Instead of using an instance i++ when adding a new HashKey, call on the 
        size of the HashMap

2. TRANSLATION LIST
        Instead of creating an ArrayList in the constructor, make one from within
        the method. Add directly to it instead of storing in a variable and adding
        the variable.
*/
