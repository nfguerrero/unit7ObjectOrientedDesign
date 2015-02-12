import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Line
{
    private Point2D.Double p1;
    private Point2D.Double p2;
    
    public Line(Point2D.Double p1, Point2D.Double p2)
    {
        this.p1.setLocation(p1.getX(), p1.getY());
        this.p2.setLocation(p2.getX(), p2.getY());
    }
    
    public void draw(Graphics2D g2)
    {
        Line2D.Double line = new Line2D.Double(this.p1, this.p2);
        
        g2.draw(line);
    }
}