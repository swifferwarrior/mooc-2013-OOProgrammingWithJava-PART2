
package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class CompoundFigure extends Figure{
    private List<Figure> shapes;

    public CompoundFigure() {
        super(0, 0);
        this.shapes = new ArrayList<Figure>();
    }

    @Override
    public void draw(Graphics graphics) {
        for (Figure shape : shapes){
            shape.draw(graphics);
        }
    }

    @Override
    public void move(int dx, int dy) {
        for (Figure shape : shapes){
            shape.move(dx, dy);
        }
    }
    
    public void add(Figure figure){
        this.shapes.add(figure);
    }
    
}

/* POST-SUBMIT NOTES */
/*
1. Coordinates
        Each shape has its own coordinates stored in the shapes list.
*/