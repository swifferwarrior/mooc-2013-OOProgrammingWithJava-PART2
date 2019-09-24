package clicker.ui;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.GridLayout;
import clicker.applicationlogic.Calculator;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Calculator calc;
    private JLabel counter;

    public UserInterface(Calculator calc) {
        this.calc = calc;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(2, 1);
        container.setLayout(layout);

        counter = new JLabel("0");
        
        JButton click = new JButton("Click!");

        ClickListener clicked = new ClickListener(this.calc, counter);
        click.addActionListener(clicked);

        container.add(counter);
        container.add(click);
    }

    public JFrame getFrame() {
        return frame;
    }
}
