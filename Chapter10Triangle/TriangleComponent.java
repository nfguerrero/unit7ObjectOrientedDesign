import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class TriangleComponent extends JComponent
{
    private int x;
    private int y;
    private int count;
    private Point2D.Double[] points;
    private Graphics2D g2;
    
    public void paintComponent(Graphics g)
    {
        this.g2 = (Graphics2D) g;
        
        this.x = getWidth();
        this.y = getHeight();
        this.count = 0;
        this.points = new Point2D.Double[3];
    }
    
    public class MyMouseListener implements MouseListener
    {
        public void mouseClicked(MouseEvent event)
        {
            if (count == 0)
            {
                Dot dot = new Dot(event.getX(), event.getY());
                dot.draw(g2);
            }
        }
        
        public void mousePressed(MouseEvent event){}
        public void mouseReleased(MouseEvent event){}
        public void mouseEntered(MouseEvent event){}
        public void mouseExited(MouseEvent event){}
    }
}