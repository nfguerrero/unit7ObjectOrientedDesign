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
   
   public boolean equals(Card object)
   {
       boolean cardEquals = false;
       
       if (object.getClass().equals(object.getClass()))
       {
           if (this.format().equals(object.format()))
           {
               cardEquals = true;
           }
       }
       
       return cardEquals;
   }
}
