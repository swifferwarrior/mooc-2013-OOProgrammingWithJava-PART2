
import java.util.Scanner;

public class TextUserInterface {

    private Scanner scanner;
    private Dictionary dictionary;

    public TextUserInterface(Scanner scanner, Dictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        //starts the interface

        System.out.println("Statements:");
        System.out.println("    add - adds a word pair to the dictionary");
        System.out.println("    translate - asks a word and prints its translation");
        System.out.println("    quit - quit the text user interface");

        while (true) {
            System.out.print("Statement: ");
            String statement = this.scanner.nextLine();

            if (statement.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (statement.equals("add")) {
                add();
            } else if (statement.equals("translate")) {
                translate();
            } else {
                System.out.println("Unknown statement");
            }
        }
    }

    public void add() {
        //asks for a word pair from the user and adds them to the dictionary  
        System.out.print("In Finnish:");
        String finnish = this.scanner.nextLine();

        System.out.print("Translation:");
        String translation = this.scanner.nextLine();

        this.dictionary.add(finnish, translation);
    }

    public void translate() {
        //asks for a word from the user and prints the translation
        System.out.print("Give a word: ");
        String word = this.scanner.nextLine();
        System.out.println("Translation: " + dictionary.translate(word));
    }

}

/* POST-SUBMIT NOTES */
/*
1. STATEMENTS LIST AT THE BEGINNING OF START()
        The list of possible statements could possibly be held in it's own method...
*/