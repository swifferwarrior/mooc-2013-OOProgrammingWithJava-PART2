
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

}
