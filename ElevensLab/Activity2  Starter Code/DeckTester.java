/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        Deck[] decks =  new Deck[3];
        
        String[][] ranks = new String[3][3];
        ranks[0][0] = "A";
        ranks[0][1] = "B";
        ranks[0][2] = "C";
        
        String[][] suits = new String[3][2];
        suits[0][0] = "Giraffes";
        suits[0][1] = "Lions";
        
        int[][] values = new int[3][3];
        values[0][0] = 2;
        values[0][1] = 1;
        values[0][2] = 6;
        
        
        for (int i = 0; i < ranks.length; i++)
        {
            Deck deck = new Deck(ranks[i], suits[i], values[i]);
            for (int j = 0; j < 7; j++)
            {
                System.out.println("Dealt: " + deck.deal());
                System.out.println("Empty: " + deck.isEmpty());
                System.out.println("Size: " + deck.size());
            }
            System.out.println("");
        }
    }
}
