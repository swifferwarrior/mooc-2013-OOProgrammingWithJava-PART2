
import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        /* Adds the parameter owner of the car which corresponds to the parameter
            registration plate. The method returns true if the car had no owner;
            if the car had an owner already, the method returns false and does nothing.*/
        if (this.owners.get(plate) == null) {
            this.owners.put(plate, owner);
            return true;
            //If the HashMap doesn't return with the key "plate", add the one provided.
        }
        return false;
    }

    public String get(RegistrationPlate plate) {
        /* Returns the car owner which corresponds to the parameter register
            number. If the car was not registered, it returns null. */
        return this.owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        /* Deletes the information connected to the parameter registration plate.
            Returns true if the info was deleted, and false if there was no 
            info connected  to the parameter in the register.*/
        if (this.owners.get(plate) == null) {
            return false;
        }

        this.owners.remove(plate);
        return true;
    }

    public void printRegistrationPlates(){
        //prints out all the registration plates stored
        for (RegistrationPlate plates : this.owners.keySet()){
            System.out.println(plates);
        }
    }
    
    public void printOwners(){
        //prints all the car owners stored
        //each owner's name has to be printed only once, even though they had more
        //than one car.
        ArrayList<String> previousPlates = new ArrayList<String>();
        
        for (String owner : this.owners.values()){
            if (!previousPlates.contains(owner)){
                System.out.println(owner);
                previousPlates.add(owner);
            }
        }
    }
}

/* POST-SUBMIT NOTES */
/*
1. PRINTING A HASHMAP
        ArrayLists use a for() loop. For hashmaps, it is for every [object] in
        a keyset versus a list.
2. PRINTING OWNERS
        Set an ArrayList to hold a list of previously named owners.
3. REMEMBER ABOUT HASHMAPS
        Hashmap is (key, value). In this case, RegistrationPlate was the key and
        owners was the value.
*/
