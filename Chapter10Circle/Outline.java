import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Outline
{
    private int x;
    private int y;
    private int rad;
    
    public Outline(Point2D.Double edge, Point2D.Double center)
    {
        this.x = (int) Math.round(center.getX());
        this.y = (int) Math.round(center.getY());
        
        double xSquare = ((edge.getX() - center.getX())*(edge.getX() - center.getX()));
        double ySquare = ((edge.getY() - center.getY())*(edge.getY() - center.getY()));
        
        this.rad = (int) Math.round(Math.sqrt(xSquare + ySquare));
    }
    
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double outline = new Ellipse2D.Double(this.x-this.rad, this.y-this.rad, this.rad*2, this.rad*2);
        
        g2.draw(outline);
    }
}