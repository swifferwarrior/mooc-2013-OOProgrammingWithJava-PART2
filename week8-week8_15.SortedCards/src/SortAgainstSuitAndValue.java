
import java.util.Comparator;

public class SortAgainstSuitAndValue implements Comparator <Card>{
    
    @Override
    public int compare(Card card1, Card card2){
        //value cannot override suit, so check suit first then order by value
        int suitComparison = card1.getSuit() - card2.getSuit();
        
        if (suitComparison == 0) {          //if suits are equal
            return card1.compareTo(card2);  
        } else {
            return suitComparison;
        }
    }
    
}

/* POST-SUBMIT NOTES */
/*
1. SORT BY SUIT
        Suits are ordered from greatest to least by their index defined in the
        final SUITS variable.
2. OVERRIDE!
        Remember to Override a compareto or comparator
3. COMPARE() METHOD
        Probably easier to read from the bottom up. By default, compare the suits.
        UNLESS they are equal, then use compareTo() to sort by value.
*/
