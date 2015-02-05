public class CallingCard extends Card
{
    private String cardNumber;
    private String pin;
    
    public CallingCard(String n, String cardNumber, String pin)
    {
        super(n);
        this.cardNumber = cardNumber;
        this.pin = pin;
    }
    
    public String format()
    {
        String name = super.format();
        return name + "\nCard Number: " + this.cardNumber
                    + "\nPIN: " + this.pin;
    }
    
    public String toString()
    {
        return "CallingCard[name = " + super.getName() + "][card number = " + this.cardNumber
                + ", pin = " + this.pin + "]"; 
    }
    
    public boolean equals(Card object)
   {
       if (this.getClass() == object.getClass())
       {
           CallingCard cardObject = (CallingCard) object;
           return this.format().equals(cardObject.format());
       }
       else
       {
           return false;
       }
   }
}