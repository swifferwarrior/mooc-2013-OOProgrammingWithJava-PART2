
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class UserInterface {

    private Scanner reader = new Scanner(System.in);
    private Fleet fleet;
    private ArrayList<String> keys = new ArrayList<String>();

    public UserInterface() {
        this.fleet = new Fleet();
    }

    //AIRPORT PANEL
    public void startAirportPanel() {
        System.out.println("Airport panel\n"
                + "--------------------\n"
                + "");

        while (true) {
            System.out.print(panelHeader());
            String operation = reader.next().toLowerCase();

            if (operation.equals("1".trim())) {
                addAirplane();
            } else if (operation.equals("2".trim())) {
                addFlight();
            } else if (operation.equals("x".trim())) {
                Collections.reverse(keys); //reverses order of Key list for printPlanes();
                startFlightService();
                break;
            }
        }
    }

    // AIRPORT PANEL METHODS
    public String panelHeader() {
        String header = "Choose operation: \n"
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
        int capacity = Integer.parseInt(reader.next());

        keys.add(planeID);
        this.fleet.addPlane(planeID, new Plane(planeID.toUpperCase(), capacity));
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

        this.fleet.getPlane(key).addFlight(departureCode, destinationCode);     //THROWS ANOTHER NULL POINTER EXCEPTION *****************************Possibly from key retrieval

    }

    //FLIGHT SERVICE
    public void startFlightService() {
        System.out.println("Flight service\n"
                + "------------\n"
                + "\n");

        while (true) {
            System.out.print(flightServiceHeader());
            String operation = reader.next().toLowerCase();

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
        String header = "Choose operation:\n"
                + "[1] Print planes\n"
                + "[2] Print flights\n"
                + "[3] Print plane info\n"
                + "[x] Quit\n"
                + "> ";

        return header;
    }

    public void printPlanes() {
        for (String key : keys) {
            System.out.println(this.fleet.getPlane(key));
        }
    }

    public void printFlights() {
        for (String key : keys) {
            for (String flight : this.fleet.getPlane(key).getFlights()) {
                System.out.println((this.fleet.getPlane(key)) + " " + flight);
            }
        }
    }

    public void printPlaneInfo() {
        askFor("plane ID");
        String key = reader.next();

        System.out.println(this.fleet.getPlane(key));
        /*2. FLIGHT SERVICE 3 - prints square brackets around the flights and only lists one flight per plane.*/
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
2. KEY ARRAYLIST INITIALIZATION
        The ArrayList was initialized, but it didn't = new ArrayList<String>()
        which threw a null pointer exception.
3. PANEL AND FLIGHT SERVICE HEADERS
        Separate the title and the operation menu.
4. OPERATION INPUT
        Place the Scanner input within the while loop to make it work as intended.
5. PRINTING MULTIPLE FLIGHTS FOR A PLANE
        Nested a for(String flight : flights) loop within a for(String key : keys)
        The keys listed the particular plane. The nexted loop printed all the flights
        for the plane individually without placing them in square brackets.
6. REMEMBER
    Refactor the Flight Service methods later.
 */
