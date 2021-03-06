package movingfigure;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListener implements KeyListener {

    private Component component;
    private Figure figure;

    public KeyboardListener(Component component, Figure figure) {
        this.component = component;
        this.figure = figure;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //when left arrow pressed, moves one point left. Same for right, up, and down.
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            figure.move(-1, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            figure.move(1, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            figure.move(0, -1);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            figure.move(0, 1);
        }
        
        component.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    
}
/* POST-SUBMIT NOTES */
/*
1. Remember to repaint 
        Objects will move but won't register on the drawingboard unless you 
        repaint after every keypress
*/