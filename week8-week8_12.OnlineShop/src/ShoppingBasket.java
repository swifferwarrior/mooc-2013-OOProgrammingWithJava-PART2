
import java.util.Map;
import java.util.HashMap;
//import java.util.List;

public class ShoppingBasket {

    private Map<String, Purchase> shoppingBasket;
    //private List<Purchase> singlePurchase;

    public ShoppingBasket() {
        this.shoppingBasket = new HashMap<String, Purchase>();

    }

    public void add(String product, int price) {
        //adds a purchase to the shopping basket
        //the purchase is defined by the parameter product and it's price is the 2nd parameter

        if (this.shoppingBasket.containsKey(product)) {
            this.shoppingBasket.get(product).increaseAmount();
        } else {
            Purchase purchase = new Purchase(product, 1, price);
            shoppingBasket.put(product, purchase);
        }
    }

    public int price() {
        //returns the shopping basket total price
        int totalPrice = 0;

        for (Purchase value : this.shoppingBasket.values()) {
            totalPrice += value.price();
        }
        return totalPrice;
    }

    public void print() {
        //prints out eh Purchase objects which are contained by the basket;
        for (Purchase item : this.shoppingBasket.values()) {
            System.out.println(item);
        }
    }
}

/* POST-SUBMIT NOTES */
 /*
1. ADD() METHOD
    First, check if the HashMap already has said product. If it does, target the
    amount within the Purchase object. The actual price does not need to be altered.
    If the object doesn't exist yet, then create a new Purchase object with an
    amount parameter of 1.
2. PRINT() METHOD
    Each HashMap is like a pair of ArrayLists. You have to specify whether you are
    adressing the Key-list or Values-list. The value of the shoppingBasket is a
    Product object, which has it's own toPrint().

 */
