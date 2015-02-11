import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class TriangleComponent extends JComponent
{
    private int x;
    private int y;
    private int count;
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        this.x = getWidth();
        this.y = getHeight();
    }
    
    public class MyMouseListener implements MouseListener
    {
        public void mouseClicked(MouseEvent event)
        {
            
        }
        
        public void mousePressed(MouseEvent event){}
        public void mouseReleased(MouseEvent event){}
        public void mouseEntered(MouseEvent event){}
        public void mouseExited(MouseEvent event){}
    }
}