public class Greetings{
    public static void testgreetings(String name, String expected){
        String result = greetings(name);
        
        System.out.println("Name: " + name + " expected: " + expected + " result: " + result);
    }
    
    public static String greetings(String name){
        return "Hello, " + name + ", how are you?";
    }

    public static void main(String [] args){
        testgreetings("Dr. Kessner", "Hello, Dr. Kessner, how are you?");
        testgreetings("Ascii Cat", "Hello, Ascii Cat, how are you?");
        testgreetings("Sydneys", "Hello, Sydneys, how are you?");
    }
}