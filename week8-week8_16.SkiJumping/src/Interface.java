
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Interface {

    private Scanner scanner = new Scanner(System.in);
    private List participants;
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
            this.participants.add(new SkiJumper(name));
            if (name.equals("")) {
                break;
            }
        }
        System.out.println("");
        System.out.println("The tournament begins!");
        startTournament();
    }

    public void startTournament() {
        System.out.println("");
        System.out.print("Write 'jump' to jump; otherwise you quit: ");
        String input = scanner.nextLine();

        while (input.equals("jump")) {
            startRound();
            System.out.print("Write 'jump' to jump; otherwise you quit: ");
            input = scanner.nextLine();
        }
        System.out.println("");
        System.out.println("Thanks!");
        //printTournamentResults();
    }

    public void startRound() {
        this.rounds++;
        System.out.println("");
        System.out.println("Round " + this.rounds);

        jumpingOrder();
        printJumpResults();
    }

    public void jumpingOrder() {
        int number = 0;
        System.out.println("");
        System.out.println("Jumping order:");

        for (SkiJumper jumper : (ArrayList<SkiJumper>)this.participants) {
            number++;
            System.out.println("  " + number + ". " + jumper.getName() + " (" + jumper.getTotalPoints() + " points)");

        }
    }
    
    public void printJumpResults() {
        System.out.println("Results of round " + this.rounds);
        for (SkiJumper jumper : (ArrayList<SkiJumper>)this.participants){
            System.out.println("  " + jumper.getName());
            System.out.println("    " + jumper.getJump(this.rounds-1).getJumpLength());
            System.out.print("    ");
            jumper.getJump(this.rounds-1).printPanelScore();
        }
    }
    
    public void printTournamentResults(){
        //position and name
    }
}
