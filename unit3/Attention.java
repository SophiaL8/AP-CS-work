public class Attention{
    public static void testattention(String hey, boolean expected){
        boolean result = attention(hey);
        System.out.println("String: " + hey + " Expected result: " + expected + " Result: " + result);
    }
    public static boolean attention(String hey){
        if(hey.substring(0, 8).equals("Hey you!")){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        testattention("Hello, my name is Inigo Montoya.", false);
        testattention("Excuse me, Dr. Kessner?", false);
        testattention("Hey you! Give me your code!", true);
    }
}