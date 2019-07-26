/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.List;
import java.util.ArrayList;

public class AverageSensor implements Sensor{
    private int number;
    private List <Sensor> sensors = new ArrayList <Sensor>();

    public AverageSensor(int number) {
        this.number = number;
    }
    
    
    
    public boolean isOn(){  // returns true if the sensor is on
        int i = 0;
        for (Sensor sensor : sensors){
            if (sensor.isOn()){
                i++;
            }
        }
        
        if (i == sensors.size()){
            return true;
        }
        return false;
    }
    
    public void on(){       // turns all sensors in list on
        for (Sensor sensor : sensors){
            sensor.on();
        }
    }
    
    public void off(){      // switches at least one or all sensors off.
        for (Sensor sensor : sensors){
            sensor.off();
        }
    }
    
    public int measure(){
        if (isOn()){
            //returns the avg of the readings of all sensors, rounded down to int
            int i = 0;
            int sum = 0;
            
            for (Sensor sensor : sensors){
                sum += sensor.measure();
                i++;
            }
            int avg = sum / i;
            return avg;
        } else {
            throw new IllegalStateException();
        }
    }
    
    public void addSensor (Sensor additional){
        //adds a new sensor to the AverageSensor
        sensors.add(additional);
    }
}
