package tools;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class PersonalDuplicateRemover implements DuplicateRemover {

    //stores the given characterStrings so that equal characterStrings are
    //removed
    private int duplicateCount = 0;
    private Set<String> stringList = new HashSet<String>();

    @Override
    public void add(String characterString) {
        //stores a characterString if it's not a duplicate
        if (stringList.contains(characterString)) {
            duplicateCount++;
        } else {
            stringList.add(characterString);
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        //returns the number of detected duplicates
        return duplicateCount;
    }

    public Set<String> getUniqueCharacterStrings() {
        //returns an object which implements the interface Set<String>
        //Object should have all unique characterStrings
        //If no unique characterStrings, returns empty set
        return stringList;
    }

    public void empty() {
        //removes stored characterStrings and resets the amount of detected duplicates
        stringList.clear();
        duplicateCount = 0;
    }

}
