/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author Admin
 */
public class You extends Character {

    private String name;
    private int length;
    private int height;

    public You() {
        this.name = "@";
        this.length = 0;
        this.height = 0;
    }

    @Override
    public void move() {
        //(String) Movement directions = reader.next();
        for (Char  char  {
            
        }: directions
        
            ){
            if (char == "w") {
                this.height--;
            }

            if (char == "s") {
                this.height++;
            }

            if (char == "a") {
                this.length--;
            }

            if (char == "d") {
                this.length++;
            }
        }

    }

    @Override
    public String coordinates() {
        return super.coordinates();
    }

}
