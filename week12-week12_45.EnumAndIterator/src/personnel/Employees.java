/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Employees {

    private List<Person> employees = new ArrayList<Person>();
    private Iterator<Person> employed = employees.iterator();

    public Employees() {
    }

    public void add(Person person) {
        //adds the person to the employees
        employees.add(person);
    }

    public void ad(List<Person> persons) {
        //adds the parameter list of people to the employees
        Iterator<Person> iterator = persons.iterator();

        while (iterator.hasNext()) {
            employees.add(iterator.next());
        }
    }

    public void print() {
        //prints all the employees
        while (employed.hasNext()) {
            System.out.println(employed.next());
        }
    }

    public void print(Education education) {
        //prints all the employess who have the same education as the one specified
        while(employed.hasNext()){
            if(employed.next().getEducation().equals(education)){
                System.out.println(employed.next());
            }
        }
    }
    
    public void fire(Education education){
        while(employed.hasNext()){
            if(employed.next().getEducation().equals(education)){
                employed.remove();
            }
        }
    }
}
