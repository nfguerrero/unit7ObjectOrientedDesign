public class NumericQuestion extends Question
{
    private double answer;
    
    public NumericQuestion()
    {
    }
    
    public void setAnswer(double correctAnswer)
    {
        this.answer = correctAnswer;
    }
    
    public boolean checkAnswer(String response)
    {
        double responseAsDouble = Double.parseDouble(response);
        
        return Math.abs(responseAsDouble - this.answer) <= .01;
    }
}