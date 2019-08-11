/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author Admin
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {

    //private List<Map> dictionary = new ArrayList<Map>();
    private Map<String, Set<String>> words = new HashMap<String, Set<String>>();
    
    

    @Override
    public void add(String word, String entry) {
        //adds a new entry to a word, maintaining the old ones
        try{
            words.get(word).add(entry);
        } catch (NullPointerException e){
            words.put(word, new HashSet<String>());
            words.get(word).add(entry);
        }
    }

    @Override
    public Set<String> translate(String word) {
        //returns a set object, with all the entries of the word, or a null referrence,
        //if the word is not in the dictionary
        try {
            return words.get(word);
        } catch (NullPointerException e) {
            return null;
        }
    }

    @Override
    public void remove(String word) {
        //removes a word and all its entries from the dictionary
        try{ 
            words.get(word).clear();
            words.remove(word);
        } catch (NullPointerException e){
            System.out.println("Word does not exist. Nothing removed.");
        }
    }
}
