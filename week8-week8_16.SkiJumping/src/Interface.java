
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Interface {

    private Scanner scanner = new Scanner(System.in);
    private List <SkiJumper> participants;
    private int rounds;

    public Interface() {
        this.participants = new ArrayList<SkiJumper>();
        this.rounds = 0;
    }

    public void registration() {
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        while (true) {
            System.out.print("Participant name: ");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }            
            this.participants.add(new SkiJumper(name));
        }
        
        System.out.println("");
        //System.out.println(this.participants.size() + " participants. This is a test to check size vs index.");
        System.out.println("The tournament begins!");
        startTournament();                                   //INDEX OUT OF BOUNDS
    }

    public void startTournament() {
        System.out.println("");
        System.out.print("Write 'jump' to jump; otherwise you quit: ");
        String input = scanner.nextLine();

        while (input.equals("jump")) {
            startRound();
            System.out.println("");
            System.out.print("Write 'jump' to jump; otherwise you quit: ");
            input = scanner.nextLine();
        }
        System.out.println("");
        System.out.println("Thanks!");
        printTournamentResults();
    }

    public void startRound() {
        this.rounds++;
        System.out.println("");
        System.out.println("Round " + this.rounds);

        jumpingOrder();
        printJumpResults();
    }

    public void jumpingOrder() {
        int number = 1;
        System.out.println("");
        System.out.println("Jumping order:");

        for (SkiJumper jumper : (ArrayList<SkiJumper>)this.participants) {
            System.out.println("  " + number + ". " + jumper.getName() + " (" + jumper.getTotalPoints() + " points)");
            number++;
        }
    }
    
    public void printJumpResults() {
        System.out.println("");
        System.out.println("Results of round " + this.rounds);
        
        for (SkiJumper jumper : (ArrayList<SkiJumper>)this.participants){
            System.out.println("  " + jumper.getName());
            jumper.addJump(new Jump());
            jumper.getJump(this.rounds-1).setJumpLength();
            System.out.println("    length: " + jumper.getJump(this.rounds-1).getJumpLength());
            System.out.print("    ");
            jumper.getJump(this.rounds-1).printPanelScore();
            jumper.getJump(this.rounds-1).adjustScore();
        }
    }
    
    public void printTournamentResults(){
        System.out.println("");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        for (SkiJumper jumper : this.participants){
            System.out.println((this.participants.indexOf(jumper)+1) + "           "
                    + jumper.getName() + " (" + jumper.getTotalPoints() + " points)");
            System.out.print("            ");
            jumper.printJumps();
        }
    }
}

/* POST-SUBMIT NOTES */
/*
1. OUT OF BOUNDS EXCEPTION DURING THE printJumpResults()
        Problem: https://www.reddit.com/r/learnjava/comments/c73qi9/mooc_java_ski_jumper_excercise_trying_to_pinpoint/
        Added line 79: new Jump
        Throwing the exception because jumps weren't actually being added to the 'jumps' list each round
*/
