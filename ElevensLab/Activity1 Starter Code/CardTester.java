/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card[] cards = new Card[3];
		cards[0] = new Card("K", "Clubs", 13);
		cards[1] = new Card("K", "Spades", 13);
		cards[2] = new Card("K", "Clubs", 13);
		int j = 0;
		
		for (int i = 0; i < cards.length; i++)
		{
		    System.out.println(cards[i].suit());
		    System.out.println(cards[i].rank());
		    System.out.println(cards[i].pointValue());
		    
		    
		    
		    if (j == 2)
		    {
		        System.out.println("this card = first card? " + cards[j].matches(cards[0]) + "\n");
		        
		        j = 0; 
		    }
		    else
		    {
		        System.out.println("this card = next card? " + cards[j].matches(cards[j+1]) + "\n");
		        
		        j++;
		    }
		}
	}
}
