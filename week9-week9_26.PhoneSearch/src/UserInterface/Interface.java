/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import java.util.Scanner;

public class Interface {

    private Scanner reader = new Scanner(System.in);

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
                System.out.print("whose number: ");
                String who = reader.next();
                System.out.print("number: ");
                String number = reader.next();
            }

            if (command.equals("2")) {
                //search for a number
                System.out.print("whose number: ");
                String who = reader.next();
                String number = reader.next();
            }

            if (command.equals("3")) {
                //search for a person by phone number
                System.out.println("number: ");
                String number = reader.next();
                if (number 
                    exists
                
                    ){
                    System.out.println(person);
                }else {
                    System.out.println(" not found");
            }
            }

            if (command.equals("4")) {
                //add an address
                System.out.println("whose address: ");
                System.out.println("street: ");
                System.out.println("city: ");
            }

            if (command.equals("5")) {
                //search for personal information
                System.out.println("whose information: ");
                //get who
                System.out.println(" address: " + address);
                System.out.println("phone numbers: ");
                for (number  : phone {
                    list
                }
                
                    ){
                        System.out.println("  " + number);
                }
            }

            if (command.equals("6")) {
                //delete personal information
                System.out.println("whose information: ");
            }

            if (command.equals("7")) {
                //filtered listeing
                System.out.println("keyword (if empty, all listed): ");
                if (not 
                    found
                
                    ){
                    System.out.println(" not found");
                }

            }

            if (command.equals("x")) {
                break;
            }
        }
    }
}
