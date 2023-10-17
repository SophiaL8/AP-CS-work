public class TestScoreKeeper
{
    public static void main(String [] args){
        ScoreKeeper s = new ScoreKeeper();
        
        s.scoreNormal();
        System.out.println("Total: " + s.getscore());
        
        s.scoreBonus();
        System.out.println("Total: " + s.getscore());
    }
    
}