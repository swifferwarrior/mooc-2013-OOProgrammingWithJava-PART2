package PhoneSearch;

import java.util.Scanner;

public class Interface {

    private Scanner reader = new Scanner(System.in);
    //private Map<String, PersonalInfo> people;
    private Contacts contacts;

    public Interface() {
        //this.people = new HashMap<String, PersonalInfo>();
        this.contacts = new Contacts();
    }

    public void start() {
        System.out.println("phone search");
        printMenu();
    }

    public void printMenu() {
        System.out.println("available operations:" + "\n"
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

        while (true) {
            if (command.equals("1")) {
                //add a number
                addNumber();
                break;
            }

            if (command.equals("2")) {
                //search for a number
                searchForNumber();
                break;
            }

            if (command.equals("3")) {
                //search for a person by phone number
                searchByNumber();
                break;
            }

            if (command.equals("4")) {
                //add an address
                addAddress();
                break;
            }

            if (command.equals("5")) {
                //search for personal information
                personalInfo();
                break;
            }

            if (command.equals("6")) {
                //delete personal information
                removePersonalInfo();
                break;
            }

            if (command.equals("7")) {
                //filtered listing
                keywordSearch();
                break;
            }

            if (command.equals("help")) {
                printMenu();
                break;
            }

            if (command.equals("x")) {
                break;
            }
        }
    }

    //1
    public void addNumber() { //1
        //needs prompt for no number
        System.out.print("whose number: ");
        String name = reader.next();

        System.out.print("number: ");
        String number = reader.next();

        contacts.addNumber(name, number);

        System.out.println("");
        command();
    }

    //2
    public void searchForNumber() { //2
        System.out.print("whose number: ");
        String name = reader.next();

        contacts.searchForNumber(name);

        System.out.println("");
        command();
    }

    //3
    public void searchByNumber() { //3
        System.out.print("number: ");
        String numberQuery = reader.next();

        contacts.searchByNumber(numberQuery);

        System.out.println("");
        command();
    }

    //4
    public void addAddress() { //4
        System.out.print("whose address: ");
        String who = reader.next();

        System.out.print("street: ");
        String street = reader.next();

        System.out.print("city: ");                                             //why is this skipped?
        String city = reader.next();

        contacts.addAddress(who, street, city);

        System.out.println("");
        command();
    }

    //5
    public void personalInfo() {
        System.out.print("whose information: ");
        String who = reader.next();

        contacts.personalInfo(who);

        System.out.println("");
        command();
    }

    //6
    public void removePersonalInfo() { //6
        System.out.print("whose information: ");
        String name = reader.next();

        contacts.removePersonalInfo(name);

        System.out.println("");
        command();
    }

    //7
    public void keywordSearch() { //7
        //filtered search by keyword (retrieving a list must be sorted by name
        //in alphabetic order). Can be in name or address.
        System.out.print("keyword (if empty, all listed): ");
        String keyword = reader.next();

        contacts.keywordSearch(keyword);

        System.out.println("");
        command();
    }
}
