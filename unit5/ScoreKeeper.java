public class ScoreKeeper
{
    public ScoreKeeper()
    {
        score = 0;
    }
    
    public void scoreNormal()
    {
        score += 100;
    }
    
    public void scoreBonus()
    {
        score += 1000;
    }
    
    public int getscore()
    {
        return score;
    }
    private int score;
}