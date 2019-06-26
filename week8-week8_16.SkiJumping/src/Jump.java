import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Jump {
    private int length;
    private int adjustedScore;
    private int totalScore;
    private Random random = new Random();

    public Jump() {
        this.length = 0;
        this.adjustedScore = 0;
        this.totalScore = 0;
    }


    
    public int judgeScore(){
        int judgeScore = (10 + random.nextInt(10));
        return judgeScore;
    }
    
    public int panelScore(){
        List scores = new ArrayList<Object>();
        
        for (Integer i =0; i > 5; i++){
            scores.add(judgeScore());
        }
        
        System.out.println("Amount of scores: " + scores.size());       //test
        
        Collections.sort(scores);
        scores.remove(Collections.max(scores));
        scores.remove(Collections.min(scores));
        
        for (Object score : scores){
            System.out.println("Ind Score: " + score);                  //test
            this.adjustedScore += (Integer)score;
        }
        
        return this.adjustedScore;
    }
    
    public int jumpLength(){
        this.length = 60 + random.nextInt(60);
        return this.length;
    }
    
    public int totalScore(){
        this.totalScore = this.length + this.adjustedScore;
        return this.totalScore;
    }
    
    
}
