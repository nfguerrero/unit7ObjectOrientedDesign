import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class ButtonViewer
{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 100;
    
    private JFrame frame;
    private JPanel panel;
    private JButton buttonA;
    private JButton buttonB;
    private JLabel label;
    
    public ButtonViewer()
    {
        this.frame = new JFrame();
        this.panel = new JPanel();
        this.buttonA = new JButton("A");
        this.buttonB = new JButton("B");
        this.label = new JLabel("No button clicked");
        
        this.panel.add(buttonA);
        this.panel.add(buttonB);
        this.panel.add(label);
  
        this.frame.add(panel);
        
        ActionListener listener = new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                label.setText("Button " + event.getActionCommand() + " was clicked");
            }
            
        };
        
        this.buttonA.addActionListener(listener);
        this.buttonB.addActionListener(listener);
        
        this.frame.setSize(this.FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        ButtonViewer viewer = new ButtonViewer();
    }
}

