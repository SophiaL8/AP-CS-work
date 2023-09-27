public class Vampire{
    
public static void TestisVampire(float hour, boolean awake, boolean expected){
    boolean result = isVampire(hour, awake);
    System.out.println("Hour: " + hour + " Awake: " + awake + " Expected: " + expected + " Result: " + result);
    
}
    public static boolean isVampire(float hour, boolean awake){
        if((hour>= 6 || hour == 22)&& awake == false){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String [] args){
        TestisVampire(6, true, false);
        TestisVampire(5, false, false);
        TestisVampire(21, false, true);
        TestisVampire(18, false, true);
    }
}