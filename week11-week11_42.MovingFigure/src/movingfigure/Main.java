package movingfigure;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        UserInterface ui = new UserInterface(new Circle(50, 50, 250));
        SwingUtilities.invokeLater(ui);
    }
}
