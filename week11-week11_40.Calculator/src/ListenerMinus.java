
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ListenerMinus implements ActionListener {
    
    private JTextField input;
    private JTextField output;
    private JButton z;
    
    public ListenerMinus(JTextField input, JTextField output, JButton z) {
        this.input = input;
        this.output = output;
        this.z = z;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int numberOut = 0;
        int numberIn = 0;
        
        try {
            numberIn = Integer.parseInt(input.getText());
            numberOut = Integer.parseInt(output.getText());
            
            numberOut -= numberIn;
            
            this.input.setText("");
            this.output.setText("" + numberOut);
            
            if (Integer.parseInt(this.output.getText()) == 0) {
                z.setEnabled(false);
            } else {
                z.setEnabled(true);
            }
        } catch (NumberFormatException n) {
            this.input.setText("");
        }
    }
    
}
