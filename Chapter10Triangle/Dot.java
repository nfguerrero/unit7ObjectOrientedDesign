import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Dot
{
    private int x;
    private int y;
    private final int RAD = 3; 
    
    public Dot(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double dot = new Ellipse2D.Double(this.x-this.RAD, this.y-this.RAD, this.RAD*2, this.RAD*2);
        
        g2.draw(dot);
        g2.fill(dot);
    }
}