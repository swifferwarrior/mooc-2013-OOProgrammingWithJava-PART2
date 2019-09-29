package movingfigure;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Figure {

    private int diameter;

    public Circle(int x, int y, int diameter) {
        super(x, y);
        this.diameter = diameter;
    }

    @Override
    public void draw(Graphics graphics) {
        //draws a circle defined by coordinates and diameter
        graphics.fillOval(super.getX(), super.getY(), this.diameter, this.diameter);
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public int getY() {
        return super.getY();
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
