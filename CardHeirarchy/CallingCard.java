public class CallingCard extends Card
{
    private String cardNumber;
    private String pin;
    
    public CallingCard(String n, String cardNumber, String PIN)
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
}