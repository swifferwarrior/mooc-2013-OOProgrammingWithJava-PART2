package movingfigure;

import java.awt.Graphics;

public abstract class Figure {

    private int x;
    private int y;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int dx, int dy) {
        //moves the figures according to the parameter coordinate movements
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract void draw(Graphics graphics); //draws the figure on the drawing board

}
