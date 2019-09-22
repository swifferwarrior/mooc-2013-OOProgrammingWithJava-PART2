package dungeon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

//Currently attempting to store both You and Vampire objects into the same HashMap.


public class Dungeon {
    private int length;
    private int height;
    private int vampires; //initial number of vampires
    private int moves; //determines the initial number of moves
    private boolean vampiresMove; //if false, the vampires don't move
    private List <Character> characters;
    private You you = new You();
    private Random random = new Random();
    

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
        this.characters = new HashMap<Character>();
    }
    
    public void run(){
        //starts the game in position 0,0
        populateVampires;
        
        while (!winner){
        System.out.println(this.moves);
        System.out.println("");
        
        printPositions();
        
        //drawDungeon();
        
        //move();
        }
    }
    
    public void printPositions(){
        System.out.println(you);
        for (Character vampire : characters){
            if (vampire.getName() =  "v"){
                System.out.println(vampire);
            }
        }
        System.out.println("");
    }
    
    public void populateVampires(){
        //for (int i = 0; i < this.vampires; i++){
            //Vampire thrall = new Vampire(random coordinates);
                //if vampiresLeft has a vampire with same coordinates, reroll
            //this.vampiresLeft.add(thrall);
        //}
    }
    
    public void move(){
        //each vampire in the list does vampire.rollCoordinates();
            //if any vampires have same getCoordinates(), reroll;
            //if out of bounds, reroll
        //You move
            //If you overlap a vampire, remove that vampire
            //If out of bounds, stop at outer bound.
        //this.moves--;
    }
    
}
