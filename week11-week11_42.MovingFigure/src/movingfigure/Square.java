
package movingfigure;

import java.awt.Graphics;

public class Square extends Figure{
    private int sideLength;

    public Square(int x, int y, int sideLength) {
        super(x, y);
        this.sideLength = sideLength;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(super.getX(),super.getY(),sideLength,sideLength);
    }

    @Override
    public void move(int dx, int dy) {
        super.move(dx, dy);
    }
    
    
}

/* POST-SUBMIT NOTES */
/*
1. Coordinates
        Coordinates must be accessed from the superclass via getX and getY. 
        Each shape does not need it's own x and y in the constructor. just the super.
*/