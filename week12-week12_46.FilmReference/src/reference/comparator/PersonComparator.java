/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.Map;
import reference.domain.Person;

/**
 *
 * @author Admin
 */
public class PersonComparator implements Comparator<Person>{
    //used later on to sort people according to their number
    private Map<Person,Integer> peopleIdentities;

    public PersonComparator(Map<Person, Integer> peopleIdentities) {
        this.peopleIdentities = peopleIdentities;
    }

    @Override
    public int compare(Person person1, Person person2) {
        return peopleIdentities.get(person2)-peopleIdentities.get(person1);
    }
    
    
}
