
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RingingCentre {
    private Map<Bird, List<String>> places;
    private Scanner reader = new Scanner(System.in);

    public RingingCentre() {
        this.places = new HashMap<Bird, List<String>>();
    }
    
    
    
    public void observe (Bird bird, String place){
        //records the observation and its place among the bird information
        //try{
            
        ArrayList <String> locations = (ArrayList) this.places.get(bird);
        locations.add(place);
        this.places.put(bird, locations);
        /*} catch (NullPointerException e){
            System.out.println("New bird identified. Please list the following:");
            System.out.print("Latin name: ");
                String latinName = reader.next();
            System.out.print("Ringing year: ");
                Integer ringingYear = Integer.parseInt(reader.next());
                
            bird = new Bird (bird.toString(), latinName, ringingYear);
            this.places.get(bird).add(place);
        }*/
    }
    
    public void observations (Bird bird){
        //prints all the observations of the parameter bird following the example
        //provided in Exercise 27.2. Observation printing order is not important.
        String seenList = "";
        int observations = 0;
        
        for (String location : this.places.get(bird)){
            seenList += location + "\n";
            observations++;
            System.out.println(bird.getLatinName() + " (" + bird.getRingingYear() + ") observations: " + observations);
            System.out.print(seenList);
        }
    }
    
}
