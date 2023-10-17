public class TestMagicEightBall{
    public static void main(String [] args){
        MagicEightBall roll = new MagicEightBall();
        
        roll.MagicEightBall("Will I be lucky today?");
        System.out.println(roll.ask());
        
        roll.MagicEightBall("Is the weather good tomorrow?");
        System.out.println(roll.ask());
        
        roll.MagicEightBall("Will tomorrow be a good day?");
        System.out.println(roll.ask());
        
            
}
}