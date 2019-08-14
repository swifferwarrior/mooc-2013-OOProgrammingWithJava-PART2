
package UserInterface;

import java.util.List;
import java.util.ArrayList;


public class PersonalInfo {
    private String name;
    private List <String> numbers;
    private String address;

    public PersonalInfo() {
        this.name = "";
        this.numbers = new ArrayList<String>();
        this.address = "";
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
    
    public void setAddress(String address) {
        this.address = address;
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
