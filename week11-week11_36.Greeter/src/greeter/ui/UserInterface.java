package greeter.ui;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {
    /*
    *Implement a user interface which displays the text "Hi!"
    *The width of JFrame has to be at least 400px, height 200px
    *Title should be Swing On
    *Should be created and become visible inside the method run()
    *Text components are added to the user interface with the method createComponents()*/

    private JFrame frame;

    public UserInterface() {
    }

    @Override
    public void run() {
        frame = new JFrame("Swing on"); //new window with title "Swing On"
        frame.setPreferredSize(new Dimension(400, 200)); //Set width and height
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack(); //Sizes the frame appropriately and...
        frame.setVisible(true); //...made visible
    }

    private void createComponents(Container container) {
        JLabel text = new JLabel("Hi!");
        container.add(text);
    }

    public JFrame getFrame() {
        return frame;
    }
}
