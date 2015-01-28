public class DriverLicense extends Card
{
    private String expYear;
    
    public DriverLicense(String n, String expYear)
    {
        this.expYear = expYear;
    }
    
    public String format()
    {
        String name = super.format();
        return name + "\nExpiration Year: " + this.expYear;
    }
}