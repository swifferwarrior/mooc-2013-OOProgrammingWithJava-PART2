
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ListenerZed implements ActionListener {
    
    private JTextField input;
    private JTextField output;
    private JButton z;
    
    public ListenerZed(JTextField input, JTextField output, JButton z) {
        this.input = input;
        this.output = output;
        this.z = z;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.input.setText("");
        this.output.setText("0");
        this.z.setEnabled(false);
    }
    
}
