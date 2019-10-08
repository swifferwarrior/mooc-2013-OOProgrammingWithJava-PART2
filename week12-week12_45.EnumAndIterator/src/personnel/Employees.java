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
    //private Iterator<Person> iterator = employees.iterator();

    public Employees() {
    }

    public void add(Person person) {
        //adds the person to the employees
        employees.add(person);
    }

    public void add(List<Person> persons) {
        //adds the parameter list of people to the employees
        Iterator<Person> iterator = persons.iterator();

        while (iterator.hasNext()) {
            employees.add(iterator.next());
        }
    }

    public void print() {
        //prints all the employees
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        //prints all the employess who have the same education as the one specified
        Iterator<Person> iterator = employees.iterator();
        while(iterator.hasNext()){
            Person employee = iterator.next();
            if(employee.getEducation().equals(education)){
                System.out.println(employee);
            }
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = employees.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getEducation().equals(education)){
                iterator.remove();
            }
        }
    }
}
