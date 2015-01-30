public class Billfold
{
    private Card card1;
    private Card card2;
    
    public Billfold()
    {
    }
    
    public void addCard(Card card)
    {
        if (this.card1 == null)
        {
            this.card1 = card;
        }
        else if (this.card2 == null)
        {
            this.card2 = card;
        }
    }
    
    public String formatCards()
    {
        String format = "";
        if (this.card1 != null)
        {
            format += this.card1.format();
            if (this.card2!= null)
            {
                format += "\n\n" + this.card2.format();
            }
        }
        return format;
    }
}