/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Interface what = new Interface();
        what.getPeople().put("Kristian", new PersonalInfo());
        what.getPeople().put("Jarissa", new PersonalInfo());
        
        //what.getPeople().get("Kristian").setAddress("123 Electric Ave", "Algood");
        //111what.getPeople().get("Jarissa").setAddress("2005 N Washington", "Cookeville");
        
        what.start();
    }
}

/* POST-SUBMIT NOTES */
/*
1. VARIABLE HAS PRIVATE ACCESS ONLY
        Tried to do what.people.put() but couldn't. Made a getPeople() in Interface class
        and then used what.getPeople().put.
*/
