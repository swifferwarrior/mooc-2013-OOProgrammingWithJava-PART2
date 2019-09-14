
package farmsimulator;

import java.lang.Math;

public class BulkTank {

    private double capacity;
    private double volume;

    public BulkTank() {
        this(2000);
    }

    public BulkTank(double capacity) {
        this.capacity = capacity;
        this.volume = 0;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getVolume() {
        return this.volume;
    }
    
    public double howMuchFreeSpace(){
        if (this.volume <= 0){
            this.volume = 0;
        }
        
        if (this.volume >= this.capacity){
            return 0;
        }
        
        return this.capacity - this.volume;
    }
    
    public void addToTank(double amount){
        //adds to the tank only as much milk as it fits
        if (amount <= 0){
            amount = 0;
        }
        
        this.volume += amount;
        
        if (this.volume >= this.capacity){
            this.volume = this.capacity;
        }
    }
    
    public double getFromTank(double amount){
        //takes the required amount from the tank or as much as is left;
        this.volume -= amount;
        if (this.volume < 0){
            this.volume = 0;
        }
        return this.volume;
    }

    @Override
    public String toString() {
        return Math.ceil(this.volume) + "/" + Math.ceil(this.capacity);
    }
    
    
}
