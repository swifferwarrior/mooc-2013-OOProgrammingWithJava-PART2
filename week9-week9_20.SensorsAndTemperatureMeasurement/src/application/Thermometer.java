/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

public class Thermometer implements Sensor {

    private boolean isOn;
    private Random random = new Random();

    public Thermometer() {
        this.isOn = false;
    }

    @Override
    public boolean isOn() {
            return this.isOn;
    }
    
    

    @Override
    public void on() {
        this.isOn = true;
    }

    @Override
    public void off() {
        this.isOn = false;
    }

    @Override
    public int measure() {
        if (isOn()) {
            int measurement = random.nextInt(60) - 30;
            return measurement;
        } else {
            throw new IllegalStateException();
        }
    }
}
