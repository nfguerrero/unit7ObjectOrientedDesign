public class Card
{
   private String name;

   public Card()
   {
      this.name = "";
   }

   public Card(String n)
   {
      this.name = n;
   }

   public String getName()
   {
      return this.name;
   }

   public boolean isExpired()
   {
      return false;
   }

   public String format()
   {
      return "Card holder: " + this.name;
   }
   
   public String toString()
   {
       return "Card[name = " + this.name + "]";
   }
   
   public boolean equals(Object object)
   {
       if (this.getClass() == object.getClass())
       {
           Card cardObject = (Card) object;
           return this.format().equals(cardObject.format());
       }
       else
       {
           return false;
       }
   }
}
