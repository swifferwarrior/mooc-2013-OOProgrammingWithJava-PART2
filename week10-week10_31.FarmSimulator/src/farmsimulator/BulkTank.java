
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
    }

    public double getCapacity() {
        return capacity;
    }

    public double getVolume() {
        return volume;
    }
    
    public double howMuchFreeSpace(){
        return 0;
    }
    
    public void addToTank(double amount){
        //adds to the tank only as much milk as it fits
    }
    
    public double getFromTank(double amount){
        //takes the required amount from the tank or as much as is left;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
