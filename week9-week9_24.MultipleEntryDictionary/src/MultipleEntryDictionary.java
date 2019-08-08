import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class MultipleEntryDictionary {
    private List<Map> dictionary = new ArrayList<Map>();
    private Map<String, Set<String>> words = new HashMap<String, Set<String>>();
    
    public void add(String word, String entry){
        //adds a new entry to a word, maintaining the old ones
        words.get(word).add(entry);
    }
    
    public Set<String> translate (String word){
        //returns a set object, with all the entries of the word, or a null referrence,
        //if the word is not in the dictionary
        try{
            return words.get(word);
        } catch (NullPointerException e){
            return null;
        }
    }
    public void remove (String word){
        //removes a word and all its entries from the dictionary
        for (String word : words.entrySet()){
            words.entrySet().remove(word);
        }
        
        words.remove(word);
