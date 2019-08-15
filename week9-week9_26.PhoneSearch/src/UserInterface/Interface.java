/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import java.util.Scanner;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class Interface {

    private Scanner reader = new Scanner(System.in);
    private Map<String, PersonalInfo> people;

    public Interface() {
        this.people = new HashMap<String, PersonalInfo>();
    }
    
    public void start() {
        System.out.println(
                "phone search" + "\n"
                + "available operations:" + "\n"
                + " 1 add a number" + "\n"
                + " 2 search for a number" + "\n"
                + " 3 search for a person by phone number" + "\n"
                + " 4 add an address" + "\n"
                + " 5 search for personal information" + "\n"
                + " 6 delete personal information" + "\n"
                + " 7 filtered listing" + "\n"
                + " x quit"
        );

        command();
    }

    public void command() {
        System.out.print("command: ");
            String command = reader.next();
        //have a bunch of "if" expressions here based on imput

        while (true) {
            if (command.equals("1")) {
                //add a number
                addNumber();
            }

            if (command.equals("2")) {
                //search for a number
                searchForNumber();
            }

            if (command.equals("3")) {
                //search for a person by phone number
                searchByNumber();
            }

            if (command.equals("4")) {
                //add an address
                addAddress();
            }

            if (command.equals("5")) {
                //search for personal information
                personalInfo();
            }

            if (command.equals("6")) {
                //delete personal information
                removePersonalInfo();
            }

            if (command.equals("7")) {
                //filtered listing
                keywordSearch();
            }

            if (command.equals("x")) {
                break;
            }
        }
    }

    public void addNumber() {
        System.out.print("whose number: ");
            String who = reader.next();
        System.out.print("number: ");
            String number = reader.next();
            
        try{
            people.get(who).addNumber(number);
        } catch (NullPointerException e){
            people.put(who, new PersonalInfo());
            people.get(who).addNumber(number);
        }
    }

    public void searchForNumber() {
        System.out.print("whose number: ");
        String who = reader.next();
        
        //String number = reader.next();
        try{
        people.get(who).getNumbers();
        } catch (NullPointerException e){
            System.out.println("not found");
        }
    }

    public void searchByNumber() {
        System.out.println("number: ");
            String number = reader.next();
        
        /*if (number 
                    
            exists
                
        
            ){
                    System.out.println(person);
        }else {
                    System.out.println(" not found");
}*/
    }

    public void addAddress() {
        System.out.println("whose address: ");
        System.out.println("street: ");
        System.out.println("city: ");
    }
    

    public void personalInfo() {
        System.out.println("whose information: ");
        //get who
        System.out.println(" address: " + address);
        System.out.println("phone numbers: ");
        for (number   : phone {
            list
        }
        )
        {
            System.out.println("  " + number);
        }
    }

    public void removePersonalInfo() {
        System.out.println("whose information: ");
    }

    public void keywordSearch() {
        System.out.println("keyword (if empty, all listed): ");
        if (not 
                    
            found
                
        
            ){
                    System.out.println(" not found");
        }

    }
}
/*
Notes:

HashMap <Person, String#> People
HashMap <String, Person> Numbers

or

Person has String name and String number
HashMap String, String for both

Person class
    String address
    <String> number
    String name
 */
