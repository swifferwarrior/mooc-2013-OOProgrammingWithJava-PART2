/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Admin
 */
public class MilkingRobot {

    private BulkTank tank;
    
    public MilkingRobot() {
        this.tank = null;
    }
    
    public BulkTank getBulkTank(){
        //returns connected bulk tank or a null reference if one isn't installed
        return this.tank;
    }
    
    public void setBulkTank(BulkTank tank){
        //installs parameter bulk tank to the milking robot
        this.tank = tank;
    }
    
    public void milk (Milkable milkable){
        //milks the cow and fills the connected bulk tank; the method returns
        //an IllegalStateException if no tank has been fixed
        if (this.tank == null) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
            Cow cow = (Cow) milkable;
            this.tank.addToTank(cow.getAmount());
            milkable.milk();
    }
}

/* POST-SUBMIT NOTES */
/*
1. THROWING EXCEPTION
        Instead of using a try/catch exception for milk(), threw a new exception 
        if this.tank was null
*/