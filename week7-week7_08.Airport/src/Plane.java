import java.util.ArrayList;
import java.util.HashMap;

public class Plane {
    //Can can go on various different flight routes
    private String planeID;
    private int capacity;
    private ArrayList<String> flights;

    public Plane(String planeID, int capacity) {

        this.planeID = planeID;
        this.capacity = capacity;
        this.flights = new ArrayList<String>();
    }

    public String getPlaneID() {
        return planeID;
    }

    public void setPlaneID(String planeID) {
        this.planeID = planeID;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public void addFlight(String departureCode, String destinationCode){
        this.flights.add("(" + departureCode.toUpperCase() + "-" + destinationCode.toUpperCase() + ")");
    }

    /*public String getFlight(int index){
        this.flights.get(index);
    }*/
    
    public ArrayList<String> getFlights() {
        return flights;
    }
    
    
    /*public void removeFlight(Flight flight){
        this.flights.remove(flight);

    }*/
    
    public String toString(){
        return this.planeID + " (" + this.capacity + " ppl)";
    }
    
    
}

/* POST-SUBMIT NOTES */
/*
1. HOW TO STORE FLIGHTS
        Rather than making flights it's own object and storing them in an object
        array, store them as strings in an ArrayList within the Planes object.
*/