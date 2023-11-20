import java.util.*;
public class Reverse{
public static String reverse(String s){
    String rev = "";
    for(int i = s.length() -1; i>=0; i--){
        rev+=s.charAt(i);
    }
    return rev;
}
public static String[] reverseAll(String [] letters){
    String[] result = new String[letters.length];
    
    for(int i = 0; i<letters.length; i++){
        result[i] = reverse(letters[i]);
    }
    return result;
}
public static void main(String[] args){
    String [] letters = {"abcd", "xyz"};
    String [] letters2 = {"1234", "5678"};
    String [] letters3 = {"racecar", "tacocat", "izzi"};
    
    String []rever = reverseAll(letters);
        System.out.println("Original String: " + Arrays.toString(letters));
        for(String x: rever)
            System.out.print(x + " ");
    System.out.println();
    
        String[]rever2 = reverseAll(letters2);
        System.out.println("Original String: " + Arrays.toString(letters2));
        for(String x: rever2)
            System.out.print( x + " ");
        System.out.println();
    
        String[]rever3 = reverseAll(letters3);
        System.out.println("Reversed String: " + Arrays.toString(rever3));
        for(String x: rever3)
            System.out.print(x + " ");
        System.out.println();
}
}