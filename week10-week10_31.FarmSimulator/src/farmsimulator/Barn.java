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
    }

    public void takeCareOf(Cow cow) {
        //milks the parameter cow with the help of the milking robot
        //throws IllegalStateException if milking robot hasn't been installed
        try {
            this.robot.milk(cow);
        } catch (IllegalStateException e) {
            System.out.println("The MilkingRobot hasn't been installed");
        }
    }

    public void takeCareOf(Collection<Cow> cows) {
        //milks the parameter cows with the help of the milking robot
        //throws IllegalStateException if the robot hasn't been installed
        try {
            for (Cow cow : cows){
                this.robot.milk(cow);
            }
        } catch (IllegalStateException e) {
            System.out.println("The MilkingRobot hasn't been installed");
        }
    }

    @Override
    public String toString() {
        //returns the state of teh bulk tank contained by the barn
        return this.tank.toString();
    }
}
