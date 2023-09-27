public class MonkeyTrouble
{
    public static void testMonkeyTrouble(boolean aSmile, boolean bSmile, boolean expected){
        boolean result = monkeyTrouble(aSmile, bSmile);
        
        System.out.println("aSmile: " + aSmile + "bSmile: " + bSmile + "expected: " + expected + "result: " + result);
        
        if(result == expected){
            System.out.println("Yay!!!");
        }else
            System.out.println("Boohoo.");
    }
    
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile){
        return(aSmile && bSmile) ||(!aSmile && !bSmile);
    }
    public static void main(String[]args){
        testMonkeyTrouble(true, true, true);
        testMonkeyTrouble(false, false, true);
        testMonkeyTrouble(true, false, false);
    }
}