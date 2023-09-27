public class parrotTrouble{
    
    public static void testparrotTrouble(boolean talking, int hour, boolean expected){
        boolean result = parrotTrouble(talking, hour);
        
System.out.println("Talking: " + talking + " Hour: " + hour + " Expected: " + expected + " Result: " + result);
        
    }
    
    public static boolean parrotTrouble(boolean talking, int hour){
          if((hour < 7 || hour>20) && talking == true){
    return true;
  }
  return false;
    }
    
    public static void main(String [] args){
        testparrotTrouble(true, 6, true);
        testparrotTrouble(true, 7, false);
        testparrotTrouble(false, 6, false);
    }
}