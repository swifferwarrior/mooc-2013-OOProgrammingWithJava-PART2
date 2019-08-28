
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {

    private Map<Bird, List<String>> places;

    public RingingCentre() {
        this.places = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place) {
        //records the observation and its place among the bird information
        if (!this.places.containsKey(bird)){
            ArrayList<String> locations = new ArrayList<String>();
            locations.add(place);
            this.places.put(bird, locations);
        } else {
            ArrayList<String> locations = (ArrayList<String>) this.places.get(bird);
            locations.add(place);
            this.places.put(bird, locations);
        }
    }

    public void observations(Bird bird) {
        //prints all the observations of the parameter bird following the example
        //provided in Exercise 27.2. Observation printing order is not important.
        if (!this.places.containsKey(bird)){
            System.out.println(bird + " observations: " + 0);
        } else {
            int observations = this.places.get(bird).size();
            System.out.println(bird + " observations: " + observations);
            for (String observed : this.places.get(bird)){
                System.out.println(observed);
            }
        }
    }
}
