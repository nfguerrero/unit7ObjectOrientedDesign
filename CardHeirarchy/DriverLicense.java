import java.util.Calendar;
import java.util.GregorianCalendar;

public class DriverLicense extends Card
{
    private String expYear;
    private GregorianCalendar calendar = new GregorianCalendar();
    
    public DriverLicense(String n, String expYear)
    {
        super(n);
        this.expYear = expYear;
    }
    
    public String format()
    {
        String name = super.format();
        return name + "\nExpiration Year: " + this.expYear;
    }
    
    public boolean isExpired()
    {
        if (calendar.get(Calendar.YEAR) >= Double.parseDouble(this.expYear))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}