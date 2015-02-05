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
    
    public String toString()
    {
        return "IDCard[name = " + super.getName() + "][ID number = " + this.idNumber + "]";
    }
    
    public boolean equals(Card object)
   {
       if (this.getClass() == object.getClass())
       {
           IDCard cardObject = (IDCard) object;
           return this.format().equals(cardObject.format());
       }
       else
       {
           return false;
       }
   }
}