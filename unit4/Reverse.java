public class Reverse
{
    public static void testreverse(String s, String expected){
        String result = reverse(s);
        
        System.out.println("String: "+ s + " Expected: " + expected + " Result " + result);
    }
    public static String reverse(String s)
    {
        String rev = "";
        for(int i = s.length() - 1; i>= 0; i--){
            rev+=s.charAt(i); 
        }
        return rev;
    }
    
    public static void main(String [] args){
        testreverse("bad", "dab");
        testreverse("Hello, world!", "!dlrow ,olleH");
        testreverse("tacocat", "tacocat");
        testreverse("Monsoon", "noosnoM");
        testreverse("RaceCar", "raCecaR");
    }
}