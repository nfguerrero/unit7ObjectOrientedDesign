public class CallingCard extends Card
{
    private String cardNumber;
    private String PIN;
    
    public CallingCard(String n, String cardNumber, String PIN)
    {
        super(n);
        this.cardNumber = cardNumber;
        this.PIN = PIN;
    }
    
    public String format()
    {
        String name = super.format();
        return name + "\nCard Number: " + this.cardNumber
                    + "\nPIN: " + this.PIN;
    }
}