
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {

    private JFrame frame;

    JTextField output;
    JTextField input;

    @Override
    public void run() {
        frame = new JFrame("Calculator");//frame
        frame.setPreferredSize(new Dimension(350, 200));//dimensions
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //close behavior

        createComponents(frame.getContentPane());//create components

        frame.pack();//pack
        frame.setVisible(true);//visible
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        JTextField output = new JTextField("0");//Text output set off with setEnabled(false)        
        JTextField input = new JTextField();//input
        output.setEnabled(false);

        JPanel panel = new JPanel(new GridLayout(1, 3));

        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton zed = new JButton("Z");

        zed.setEnabled(false);

        //add listeners
        plus.addActionListener(new ListenerPlus(input, output, zed));
        minus.addActionListener(new ListenerMinus(input, output, zed));
        zed.addActionListener(new ListenerZed(input, output, zed));

        panel.add(plus);
        panel.add(minus);
        panel.add(zed);

        container.add(output);
        container.add(input);
        container.add(panel);
        //container.add(createPanel());
    }

    /*private JPanel createPanel() {
        JPanel panel = new JPanel(new GridLayout(1, 3));

        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton zed = new JButton("Z");

        zed.setEnabled(false);

        //add listeners
        plus.addActionListener(new ListenerPlus(input, output, zed));
        minus.addActionListener(new ListenerMinus(input, output, zed));
        zed.addActionListener(new ListenerZed(input, output, zed));

        panel.add(plus);
        panel.add(minus);
        panel.add(zed);

        return panel;
    }*/
    
    public JFrame getFrame() {
        return frame;
    }
}

/*POST SUBMIT NOTES*/
/*
1. JPanel method
        Tried to assign panel to its own method to be called. Listeners were not
        able to function properly until added to createComponents(). Must investigate why.

2. Multiple actions, one listener
        If you put each component as a parameter in a single listener, the 
        actionPerformed() method can detect which action to take by using if/else if
        statements. I.e "if == plus else if == minus else == z). They can pull from
        a single ApplicationLogic.java
*/