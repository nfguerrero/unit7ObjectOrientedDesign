import java.util.Scanner;

public class FillInQuestion extends Question
{
    // specified text: "this is an _example_ with underscores"
    // this class conversts specified text into
    // text: "this is an _____ with underscores"
    // anwer: "example"
    
    public FillInQuestion()
    {
    }
    
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question += "_____" + parser.next();
        
        super.setText(question);
        super.setAnswer(answer);
    }
}