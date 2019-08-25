
package PhoneSearch;

import java.util.List;
import java.util.ArrayList;


public class PersonalInfo {
    private String name;
    List <String> numbers;
    private String street;
    private String city;

    public PersonalInfo() {
        this.name = "";
        this.numbers = new ArrayList<String>();
        this.city = "";
        this.street = "";
    }
    
    public PersonalInfo(String name){
        this.name = name;
        this.numbers = new ArrayList<String>();
        this.city = "";
        this.street = "";        
    }

    public List<String> getNumbers() {
        return this.numbers;
    }

    public String getAddress() {
        return this.street + " " + this.city;
    }

    public String getName() {
        return name;
    }
    
    public void setAddress(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public void addNumber(String number){
        this.numbers.add(number);
    }
    
    public void removeNumber(String number){
        for (String compared : this.numbers){
            if (compared.equalsIgnoreCase(number)){
                this.numbers.remove(number);
            }
        }
    }    

    public void setName(String name) {
        this.name = name;
    }
    
}
