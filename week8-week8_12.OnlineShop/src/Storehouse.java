import java.util.Collections;
import java.util.Set;

public class Storehouse {

    public void addProduct (String product, int price, int stock){
        //adds a product whose price and number of stocks to the storehouse
    }
    
    public int price (String product) {
        //returns the price of teh parameter product
        //if the produt is not available in teh storehouse, the method returns -99
        return -99;
    }
    
    public int stock (String product){
        //returns the stock of the parameter product
        return 0;
    }
    
    public boolean take (String product){
        //decreases the stock of the parameter product by one
        //returns true if the object was available in the storehouse
        //if product not in storehouse, method returns false
        //product cannot go below zero
        return false;
    }
    
    public Set<String> products() {
        //returns a name set of the products contained in the storehouse
        return null;
    }
}
