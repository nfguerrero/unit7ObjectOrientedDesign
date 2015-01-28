public class ComboLock
{
    private int lock1;
    private int lock2;
    private int lock3;
    private int point;
    private int numRight;
    private int numTurns;
    
    public ComboLock(int secret1, int secret2, int secret3)
    {
        this.lock1 = secret1;
        this.lock2 = secret2;
        this.lock3 = secret3;
        this.point = 0;
        this.numRight = 0;
        this.numTurns = 0;
    }
    
    public void reset()
    {
        this.point = 0;
        this.numRight = 0;
        this.numTurns = 0;
    }
    
    public void turnLeft(int ticks)
    {
        this.point -= ticks;
        if (this.point < 0)
        {
            this.point += 40;
        }
        if (this.numTurns == 1)
        {
            if (this.point == lock2)
            {
                this.numRight++;
            }
        }
        this.numTurns++;
    }
    
    public void turnRight(int ticks)
    {
        this.point += ticks;
        if (this.point > 39)
        {
            this.point -= 40;
        }
        if (this.numTurns == 0)
        {
            if (this.point == lock1)
            {
                this.numRight++;
            }
        }
        else if (this.numTurns == 2)
        {
            if (this.point == lock3)
            {
                this.numRight++;
            }
        }
        this.numTurns++;
    }
    
    public boolean open()
    {
        if (this.numTurns == 3 && this.numRight == 3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static void main(String[] args)
    {
        ComboLock lock = new ComboLock(39, 14, 0);
        lock.turnRight(39);
        lock.turnLeft(25);
        lock.turnRight(26);
        System.out.print(lock.open());
    }
}