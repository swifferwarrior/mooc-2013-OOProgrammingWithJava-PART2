
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Storehouse {

    private Map<String, Integer> product;
    private Map<String, Integer> productAmount;

    public Storehouse() {
        this.product = new HashMap<String, Integer>();
        this.productAmount = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        //adds a product whose price and number of stocks to the storehouse
        for (int i = 0; i < stock; i++) {
            this.product.put(product, price);
            this.productAmount.put(product, stock);
        }
    }

    public int price(String product) {
        //returns the price of teh parameter product
        //if the produt is not available in teh storehouse, the method returns -99
        if (this.product.containsKey(product)) {
            return this.product.get(product);
        } else {
            return -99;
        }
    }

    public int stock(String product) {
        //returns the stock of the parameter product
        if (this.productAmount.containsKey(product)) {
            return this.productAmount.get(product);
        } else {
            return 0;
        }
    }

    public boolean take(String product) {
        //decreases the stock of the parameter product by one
        //returns true if the object was available in the storehouse
        //if product not in storehouse, method returns false
        //product cannot go below zero
        int newStock = 0;
        
        if (this.productAmount.containsKey(product)) {
            newStock = this.productAmount.get(product);
            if (newStock > 0) {
                newStock--;
                this.productAmount.replace(product, newStock);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public Set<String> products() {
        //returns a name set of the products contained in the storehouse
        Set<String> tempSet = new HashSet<String>();

        for (String key : this.productAmount.keySet()) {
            tempSet.add(key);
        }

        return tempSet;
    }

}

/* POST-SUBMIT NOTES */
/*
1. NEW OBJECTS
    You can declare an abstract variable, but when instantiating it, it needs to be
    specified. (I.e. Map is abstract, but HashMap is more specific)
    
    Quote: Inside the storehouse, the prices (and soon also the stocks) of the 
    products have to be stored into a Map<String, Integer> variable! The type of 
    the object so created can be HashMap, but you should use the interface Map 
    for the variable type (see 40.4.2)
2. SET() METHOD
    This is an array of hashcodes, so a HashSet needs to be made
3. TAKE() METHOD
    Rather than removing old product with outdated amount and putting in new product
    with correct amount, use the replace() method.
*/
