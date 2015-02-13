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
    
    public TriangleComponent()
    {
        this.x = getWidth();
        this.y = getHeight();
        this.count = 0;
        this.points = new Point2D.Double[3];
        
        MyMouseListener listener = new MyMouseListener();
        this.addMouseListener(listener);
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        if (this.count > 0 && this.count < 4)
        {
            Dot dot = new Dot(this.points[this.count-1]);
            dot.draw(g2);
        }
   
    }
    
    public class MyMouseListener implements MouseListener
    {
        public void mouseClicked(MouseEvent event)
        {
            count++;
            points[count-1] = new Point2D.Double(event.getX(), event.getY());
            
            if (count < 4){count++;}
            else {count = 0;}
            
            repaint();
        }
        
        public void mousePressed(MouseEvent event){}
        public void mouseReleased(MouseEvent event){}
        public void mouseEntered(MouseEvent event){}
        public void mouseExited(MouseEvent event){}
    }
}