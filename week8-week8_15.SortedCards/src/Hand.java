//import java.util.Map;
//import java.util.HashMap;

import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {

    /*private Map <Integer, Card> hand; 

    public Hand(HashMap <Integer, Card> hand) {
        this.hand = new HashMap <Integer, Card>();
    }*/
    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<Card>();
    }

    public void add(Card card) {
        //adds a card to the hand
        this.hand.add(card);
    }

    public void print() {
        //prints the cards in the hand (i.e. 2 of Spades)
        for (Card card : this.hand) {
            System.out.println(card);
        }
    }

    public void sort() {
        //sorts the cards in the hand then prints them in that order
        Collections.sort(this.hand);
    }
    
    public int sum() {
        int sum = 0;
        
        for (Card card : this.hand){
            sum += card.getValue();
        }
        return sum;
    }

    @Override
    public int compareTo(Hand other) {
        //compares sum of one hand to another
        return this.sum() - other.sum();
        /*
        int thisSum = 0;
        int otherSum = 0;

        for (Card card : this.hand) {
            thisSum += card.getValue();
        }

        for (Card card : other.hand) {
            otherSum += card.getValue();
        }

        if (thisSum > otherSum) {
            return 1;
        } else if (thisSum == otherSum) {
            //return 0;
        } else {

            return -1;
        }
        */
    }
    
    public void sortAgainstSuit(){
        //the hand's cards are sorted according to comparator <SortAgainstSuitAndValue>
        Collections.sort(hand, new SortAgainstSuitAndValue());
    }

}

/* POST-SUBMIT NOTES */
/*
1. COMPARE TO METHOD WITH SUMS
        Created to sum instances and specified the 1,0,-1 manually rather than
        creating a (this.sum - other.sum) expression.
        Also split up the sum() and compareTo() methods. Two jobs means two methods.
2. USING COMPARATORS
        In 'Collections.sort(), there can be a second parameter which can be a 
        class that uses a Comparator interface.
*/
