public class ChoiceQuestion extends Question
{
    // choice question is displayed as the text of the question and
    // a list of the choices
    // example:
    //  "What are the primary colors of light?"
    //  1) red, blue, yellow
    //  2) red, blue, green
    //  3) purple, pink, orange
    
    private int numChoices;
    
    public ChoiceQuestion()
    {
        super();
        numChoices = 0;
    }
    
    public void addChoice(String choice, boolean correct)
    {
        numChoices++;
        
        super.addText("\n" + this.numChoices + ") " + choice);
        
        if (correct)
        {
            String answerString = "" + numChoices;
            super.setAnswer(answerString);
        }
    }
}