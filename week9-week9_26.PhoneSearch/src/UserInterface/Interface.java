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
        System.out.println("phone search" + "\n"
                + "available operations:" + "\n"
                + " 1 add a number" + "\n"
                + " 2 search for a number" + "\n"
                + " 3 search for a person by phone number" + "\n"
                + " 4 add an address" + "\n"
                + " 5 search for personal information" + "\n"
                + " 6 delete personal information" + "\n"
                + " 7 filtered listing" + "\n"
                + " x quit" + "\n"
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
                //keywordSearch();
                System.out.println("uncomment keywordSearch()");
            }

            if (command.equals("x")) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("not an option" + "\n");
                System.out.print("command: ");
                command = reader.next();
            }
        }
    }

    public Map<String, PersonalInfo> getPeople() {
        return this.people;
    }

    public void addNumber() {
        System.out.print("whose number: ");
        String who = reader.next();
        System.out.print("number: ");
        String number = reader.next();

        try {
            people.get(who).addNumber(number);
        } catch (NullPointerException e) {
            people.put(who, new PersonalInfo());
            people.get(who).addNumber(number);
        }

        System.out.println("");
        command();
    }

    public void searchForNumber() {
        System.out.print("whose number: ");
        String who = reader.next();

        //String number = reader.next();
        try {
            //people.get(who).getNumbers();
            for (String number : people.get(who).numbers) {
                System.out.println("  " + number);
            }
        } catch (Exception e) {
            System.out.println("not found");
        }

        System.out.println("");
        command();
    }

    public void searchByNumber() { //post submit note needed
        System.out.print("number: ");
        String numberQuery = reader.next();
        boolean found = false;
        
        for (String key : people.keySet()){
            for (String number : people.get(key).getNumbers()){
                if (number.equals(numberQuery)){
                    System.out.println(" " + key);
                    found = true;
                }
            }
        if (!found){
            System.out.println(" not found");
        }
        }

        System.out.println("");
        command();
    }

    public void addAddress() {
        System.out.print("whose address: ");
        String who = reader.next();

        System.out.print("street: ");
        String street = reader.next();

        System.out.print("city: ");                                             //why is this skipped?
        String city = reader.next();

        try {
            people.get(who).setAddress(street, city);
        } catch (NullPointerException e) {
            people.put(who, new PersonalInfo());
            people.get(who).setAddress(street, city);
        }

        System.out.println("");
        command();
    }

    public void personalInfo() {
        System.out.print("whose information: ");
        String who = reader.next();

        if (people.get(who).getAddress().equals(" ")) {
            System.out.println(" address unknown");
        } else {
        
            try {

                System.out.println(" address: " + people.get(who).getAddress());
            } catch (Exception e) {
                System.out.println("  address unknown");
            }
        }

        if (people.get(who).getNumbers().isEmpty()) {
            System.out.println("  phone number not found");
        } else {

            try {
                System.out.println(" phone numbers: ");
                for (String number : people.get(who).numbers) {
                    System.out.println("  " + number);
                }
            } catch (Exception e) {
                System.out.println("  phone number not found");
            }
        }

        System.out.println("");
        command();
    }

    public void removePersonalInfo() {
        System.out.print("whose information: ");
        String who = reader.nextLine();

        people.remove(who);

        System.out.println("");
        command();
    }

    public void keywordSearch() {
        System.out.println("keyword (if empty, all listed): ");
        String keyword = reader.next();
        
        List<String> namesAndAddresses = new ArrayList<String>();
            
        for (String name : people.keySet()){
                namesAndAddresses.add(name);
                namesAndAddresses.add(people.get(name).getAddress());
            }
        
        namesAndAddresses.sort(c);
        
        //add for loop for keyset to nest the following in
        for (String item : namesAndAddresses){
            if(item.contains(keyword)){
                        if (people.get(item).getAddress().equals(" ")) {
            System.out.println(" address unknown");
        } else {
        
            try {

                System.out.println(" address: " + people.get(item).getAddress());
            } catch (Exception e) {
                System.out.println("  address unknown");
            }
        }

        if (people.get(item).getNumbers().isEmpty()) {
            System.out.println("  phone number not found");
        } else {

            try {
                System.out.println(" phone numbers: ");
                for (String number : people.get(item).numbers) {
                    System.out.println("  " + number);
                }
            } catch (Exception e) {
                System.out.println("  phone number not found");
            }
        } else {
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
