import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class TriangleComponent extends JComponent
{
    private int count;
    private Point2D.Double[] points;
    
    public TriangleComponent()
    {
        this.count = -1;
        this.points = new Point2D.Double[3];
        for (int i = 0; i < this.points.length; i++)
        {
            this.points[i] = new Point2D.Double();
        }
        
        MyMouseListener listener = new MyMouseListener();
        this.addMouseListener(listener);
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        if (this.count >= 0)
        {
            Dot dot1 = new Dot(this.points[0]);
            dot1.draw(g2);
            
            if (this.count >= 1)
            {
                Dot dot2 = new Dot(this.points[1]);
                Line line1 = new Line(this.points[0], this.points[1]);
                
                dot2.draw(g2);
                line1.draw(g2);
                
                if (this.count >= 2)
                {
                    Dot dot3 = new Dot(this.points[2]);
                    Line line2 = new Line(this.points[1], this.points[2]);
                    Line line3 = new Line(this.points[2], this.points[0]);
                    
                    dot3.draw(g2);
                    line2.draw(g2);
                    line3.draw(g2);
                }
            }
        }
    }
    
    public class MyMouseListener implements MouseListener
    {
        public void mouseClicked(MouseEvent event)
        {
            if (count < 2){count++;}
            else {count = 0;}
            
            points[count].setLocation(event.getX(), event.getY());
            
            repaint();
        }
        
        public void mousePressed(MouseEvent event){}
        public void mouseReleased(MouseEvent event){}
        public void mouseEntered(MouseEvent event){}
        public void mouseExited(MouseEvent event){}
    }
}