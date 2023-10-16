public class CountOccurences{
    public static void testCountOccurences(String s, String sub, int expected){
        int result = countOccurences(s, sub);
        System.out.println("Full String: " + s + " Substring: " + sub + " Expected: " + expected + " Result: " + result);
    }
    
    public static int countOccurences(String s, String sub){
        int count = 0;
        for(int i = 0; i<= s.length() - sub.length(); i++){
        String answer = s.substring(i, i+sub.length());
            
        if(answer.equals(sub))
                count ++;
        }
        return count;
    }
    
    public static void main(String[] args){
        testCountOccurences("Mississippi", "iss", 2);
        testCountOccurences("banananana", "na", 4);
        testCountOccurences("hehehehehe", "he", 5);
        testCountOccurences("Crayrayray", "ray", 3);
    }
}