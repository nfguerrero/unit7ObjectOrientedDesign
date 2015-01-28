public class IDCard extends Card
{
    private String idNumber;
    
    public IDCard(String n, String id)
    {  
        super(n);
        this.idNumber = id;
    }
    
    public String format()
    {
        String name = super.format();
        return name + "\nID Number: " + this.idNumber;
    }
}