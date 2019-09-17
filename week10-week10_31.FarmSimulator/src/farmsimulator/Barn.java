package farmsimulator;

import java.util.Collection;

public class Barn {

    private BulkTank tank;
    private MilkingRobot robot;

    public Barn(BulkTank tank) {
        this.tank = tank;
        this.robot = null;
    }

    public BulkTank getBulkTank() {
        return this.tank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        //installs a milking robot and connects it to the barn bulk tank
        this.robot = milkingRobot;
        this.robot.setBulkTank(this.tank); //don't forget to do this part too!!!
    }

    public void takeCareOf(Cow cow) {
        //milks the parameter cow with the help of the milking robot
        //throws IllegalStateException if milking robot hasn't been installed
        if (this.robot == null) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
        this.robot.milk(cow);
    }

    public void takeCareOf(Collection<Cow> cows) {
        //milks the parameter cows with the help of the milking robot
        //throws IllegalStateException if the robot hasn't been installed
        if (this.robot == null) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }

        for (Cow cow : cows) {
            this.robot.milk(cow);
        }
    }

    @Override
    public String toString() {
        //returns the state of teh bulk tank contained by the barn
        return this.tank.toString();
    }
}

/* POST-SUBMIT NOTES */
 /*
1. INSTALLING MILK ROBOT
        I set the robot for this class, but i forgot to set the bulk tank in the milking robot class.
 */
