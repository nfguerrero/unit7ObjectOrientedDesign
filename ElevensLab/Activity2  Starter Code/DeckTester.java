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
        ranks[1][0] = "K";
        ranks[1][1] = "A";
        ranks[1][2] = "J";
        ranks[2][0] = "Z";
        ranks[2][1] = "Y";
        ranks[2][2] = "X";
        
        String[][] suits = new String[3][2];
        suits[0][0] = "Giraffes";
        suits[0][1] = "Lions";
        suits[1][0] = "Clubs";
        suits[1][1] = "Spades";
        suits[2][0] = "Davids";
        suits[2][1] = "Nics";
        
        int[][] values = new int[3][3];
        values[0][0] = 2;
        values[0][1] = 1;
        values[0][2] = 6;
        values[1][0] = 13;
        values[1][1] = 1;
        values[1][2] = 11;
        values[2][0] = 5;
        values[2][1] = 7;
        values[2][2] = 9;
        
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
