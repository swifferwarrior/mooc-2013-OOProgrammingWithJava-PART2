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
    
    void setBulkTank(BulkTank tank){
        //installs parameter bulk tank to the milking robot
        this.tank = tank;
    }
    
    void milk (Milkable milkable){
        //milks the cow and fills the connected bulk tank; the method returns
        //an IllegalStateException if no tank has been fixed
        try{
            Cow cow = (Cow) milkable;
            this.tank.addToTank(cow.getAmount());
            milkable.milk();
        } catch (IllegalStateException e){
            System.out.println("The MilkingRobot hasn't been installed");
        }
    }
}
