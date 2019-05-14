
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class UserInterface {

    private Scanner reader = new Scanner(System.in);
    private Fleet fleet;
    private ArrayList<String> keys;

    public UserInterface() {
        this.fleet = new Fleet();
    }

    //AIRPORT PANEL
    public void startAirportPanel() {
        System.out.print(panelHeader());
        String operation = reader.next().toLowerCase();

        while (true) {
            if (operation.equals("1".trim())) {
                addAirplane();                                                  //THROWS ANOTHER NULL POINTER EXCEPTION
            } else if (operation.equals("2".trim())) {
                addFlight();                                                     //THROWS ANOTHER NULL POINTER EXCEPTION
            } else if (operation.equals("x".trim())) {
                startFlightService();                                           //THROWS ANOTHER NULL POINTER EXCEPTION ***************
                break;
            }
        }
    }
    
    // AIRPORT PANEL METHODS

    public String panelHeader() {
        String header = "Airport panel\n"
                + "--------------------\n"
                + ""
                + "Choose operation: \n"
                + "[1] Add airplane \n"
                + "[2] Add flight \n"
                + "[x] Exit\n"
                + "> ";
        return header;
    }

    public void addAirplane() {
        //Get's plane ID and capacity
        askFor("plane ID");
        String planeID = reader.next();

        askFor("plane capacity");
        int capacity = Integer.parseInt(reader.next());                          //POSSIBLE NULL POINTER EXCEPTION???

        keys.add(planeID);                                                      //THROWS ANOTHER NULL POINTER EXCEPTION
        this.fleet.addPlane(planeID, new Plane(planeID, capacity));
    }

    public void addFlight() {
        //1)Gets plane ID, 2) Gets airport departure and destination codes
        //QUESTION - How do you specify which Plane gets the codes?
        askFor("plane ID");
        String key = reader.next();

        askFor("departure airport code");
        String departureCode = reader.next();

        askFor("destination airport code");
        String destinationCode = reader.next();

        this.fleet.getPlane(key).addFlight(departureCode, destinationCode);     //THROWS ANOTHER NULL POINTER EXCEPTION

    }

    //FLIGHT SERVICE
    public void startFlightService() {
        System.out.print(flightServiceHeader());
        String operation = reader.next().toLowerCase();

        while (true) {
            if (operation.equals("1".trim())) {
                printPlanes();                                                  //THROWS ANOTHER NULL POINTER EXCEPTION
            } else if (operation.equals("2".trim())) {
                printFlights();                                                 //THROWS ANOTHER NULL POINTER EXCEPTION
            } else if (operation.equals("3".trim())) {
                printPlaneInfo();                                               //THROWS ANOTHER NULL POINTER EXCEPTION
            } else if (operation.equals("x".trim())) {
                break;
            }

        }
    }

    //FLIGHT SERVICE METHODS
    public String flightServiceHeader() {
        String header = "Flight service\n"
                + "------------\n"
                + "\n"
                + "Choose operation:\n"
                + "[1] Print planes\n"
                + "[2] Print flights\n"
                + "[3] Print plane info\n"
                + "[x] Quit\n"
                + "> ";

        return header;
    }

    public void printPlanes() {
        //for (String key : this.fleet.{
        for (String key : keys) {                                               //THROWS ANOTHER NULL POINTER EXCEPTION ************************************
            /*      for (this.fleet.getPlane(key) : this.fleet)
        }
            
        }
        for (Fleet planes : this.fleet){
            String key = "";*/
            System.out.println(this.fleet.getPlane(key));
        }
    }

    public void printFlights() {
        for (String key : keys) {                                               //THROWS ANOTHER NULL POINTER EXCEPTION ****************************
            System.out.println(this.fleet.getPlane(key).getFlights());
        }
    }

    public void printPlaneInfo() {
        askFor("plane ID");
        String key = reader.next();

        System.out.println(this.fleet.getPlane(key).getFlights());              //THROWS ANOTHER NULL POINTER EXCEPTION

    }

    public void askFor(String info) {
        System.out.print("Give " + info + ": ");
    }
}

/* POST-SUBMIT NOTES */
 /*
1. SCANNER
        You don't need to add scanner to the constructor. Just declare it as
        new Scanner(System.in) in a private variable.
 */
