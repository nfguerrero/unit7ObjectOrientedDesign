Activity 5:
1. Buggy1:
    Constructor or Method: isEmpty Method
    Possible Code Error: return size != 0
    
2. Buggy2:
    Constructor or Method: Deck Constructor
    Possible Code Error: size = cards.size()-1
    
3. Buggy3:
    Constructor or Method: shuffle Method
    Possible Code Error: Doesn't change the cards ArrayList, but rather, a shuffled ArrayList in the method
    
4. Buggy4:
    Constructor or Method: deal Method
    Possible Code Error: return null if !isEmpty, rather than isEmpty

Activity 6:
1. 5spades,6clubs - 5clubs, 6clubs

2. Yes, because every card has a pair to go with it, and the j,q,k are the only triplets

3. No, because you'll just take the remaining pair after getting your new cards, and you'd end up with the same cards
   face up, no matter the order you replaced them. The game is decided after the deck is shuffled.
   

Activity 7:
1. cards on board
   cards left
   
2. check pair(checks if the pair selected adds to 11)
   check faces(checks if 3 cards selected are j,q,k)
   replace(checks how many cards are missing on board and deals accordingly)
   
3. Yes

4a. When the class is first initialized, and when it is told to start a new game

4b. public boolean isLegal(List<Integer> selectedCards)
    public boolean anotherPlayIsPossible()
    
4c. returned list = {0, 1, 3, 6. 7}

4d. public static printCards(ElevensBoard board)
    {
        List<Integer> cIndexes = board.cardIndexes();
        
        for (int i = 0; i < cIndexes.size(); i++)
        {
            System.out.println(board.cardAt(i));
        }
    }
    
4e. anotherPlayPossible(), because it needs to check the remaining cards on the board, while isLegal() just checks
    if that current selection is legal