
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Jump {

    private int length;
    private List judgeVotes;
    private int adjustedScore;
    private int totalJumpScore;
    private Random random = new Random();

    public Jump() {
        this.length = 0;
        this.judgeVotes = new ArrayList<Integer>();
        this.adjustedScore = 0;
        this.totalJumpScore = 0;
    }

    public void setJumpLength() {
        this.length = 60 + random.nextInt(60);
    }
    
    public int getJumpLength() {

        return this.length;
    }

    public void printJumpLength() {
        System.out.println("length: " + this.length);
    }
    
    public int judgeScore() {
        int judgeScore = (10 + random.nextInt(10));
        return judgeScore;
    }

    public void panelScore() {
        //List scores = new ArrayList<Object>();

        for (Integer i = 0; i < 4; i++) {
            this.judgeVotes.add(judgeScore());
        }

        //System.out.println("Amount of scores: " + this.judgeVotes.size());       //test

    }

    public void printPanelScore() {
        //if (judgeVotes.size() < 5) {
        //    System.out.println("The judges have not finished scoring!");
        //} else {
        panelScore();
            System.out.print("judge votes: [");
            for (int i = 0; i < (this.judgeVotes.size()); i++) {
                System.out.print(judgeVotes.get(i) + ", ");
            }
            System.out.println(judgeVotes.get(this.judgeVotes.size()-1) + "]");
        //}
    }

    public void adjustScore() {
        Collections.sort(judgeVotes);
        judgeVotes.remove(Collections.max(judgeVotes));
        judgeVotes.remove(Collections.min(judgeVotes));

        for (Object score : judgeVotes) {
            //System.out.println("Ind Score: " + score);                  //test
            this.adjustedScore += (Integer) score;
        }
        //return this.adjustedScore;
    }

    public int getTotalJumpScore() {
        this.totalJumpScore = this.length + this.adjustedScore;
        return this.totalJumpScore;
    }
    
    @Override
    public String toString() {
        return "Total length: " + this.length + "\n"
                + "Total jump score: " + this.totalJumpScore;
    }

}
