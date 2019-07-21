
package moving.domain;

public class Item implements Thing, Comparable<Item> {

    private String name;
    private int volume;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return this.name;
    }

    public int getVolume() {
        return this.volume;
    }

    @Override
    public String toString() {
        return name + " (" + volume + " dm^3)";
    }
    
    /*@Override
    public void sort(List items){
        Collections.sort(this.volume);
    }*/

    @Override
    public int compareTo(Item compared) {
        return this.volume - compared.volume;
    }
}

/* POST-SUBMIT NOTES */
/*
1. 'COMPARABLE' PROBLEM
        Problem: "Item is not abstract and does not override compareTo" despite implementing
        implementing Comparable
        Solution: Comparable needs '<Item>' appended to it.
*/