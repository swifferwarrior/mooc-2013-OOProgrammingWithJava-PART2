
package movingfigure;

import java.awt.Graphics;

public class Box extends Figure{
    private int width;
    private int height;

    public Box(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(super.getX(),super.getY(), width, height);
    }

    @Override
    public void move(int dx, int dy) {
        super.move(dx, dy); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

/* POST-SUBMIT NOTES */
/*
1. Coordinates
        Coordinates must be accessed from the superclass via getX and getY. 
        Each shape does not need it's own x and y in the constructor. just the super.
*/