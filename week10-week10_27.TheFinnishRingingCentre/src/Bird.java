
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
    
    //Exc. 27.1
    //Two Bird objects have to be understood as the same bird if their Latin name
    //and observation year are the same.
    
    @Override
    public boolean equals(Object other){
        if (other == null ||this.getClass() != other.getClass()){
            return false;
        }
        
        Bird newOther = (Bird) other;
        
        if (this.latinName != newOther.latinName){
            return false;
        }
            
        if (this.ringingYear != newOther.ringingYear){
            return false;
        }
        
        return true;
    }
    
    @Override
    public int hashCode(){
        return this.ringingYear + this.latinName.hashCode();
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getRingingYear() {
        return ringingYear;
    }
    
}


