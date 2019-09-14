/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive {

    private String name;
    private double capacity;
    private double amtAvailable;
    private Random random = new Random();
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow() {
        int assignName = random.nextInt(NAMES.length - 1);
        
        this.name = NAMES[assignName];
        this.capacity = 15 + random.nextInt(25);
        this.amtAvailable = 0;
    }

    public Cow(String name) {
        this.name = name;
        this.capacity = 15 + random.nextInt(25);
        this.amtAvailable = 0;
    }

    public String getName() {
        return this.name;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getAmount() {
        //returns volMilked available in cow's udders
        return this.amtAvailable;
    }

    @Override
    public String toString() {
        return this.name + " " + this.amtAvailable + "/" + this.capacity;
    }

    @Override
    public double milk() {
        this.amtAvailable = 0;
        return this.amtAvailable;
    }

    @Override
    public void liveHour() {
        this.amtAvailable += (7 + random.nextInt(13))/10;
    }

}
