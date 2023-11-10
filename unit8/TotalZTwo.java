import java.util.*;
public class TotalZTwo{
    public static void testcountZnames(ArrayList<String> names, int expected){
        int result = countZnames(names);
        
        for(String z: names){
            System.out.println(z);
        }
        System.out.println("Expected: " + expected + " Result: " + result);
    }
    public static int countZnames(ArrayList<String> names){
    int namelength = 0;
        for(String name: names){
            char letter = name.charAt(0);
            if(letter == 'Z' || letter == 'z'){
                namelength += name.length();
            }
        }
        return namelength;
    }
    public static void main(String[] args){
    ArrayList<String> name = new ArrayList<String>();
    name.add("Dr. Kessner");
    name.add("Dr. Sands");
        
    ArrayList<String> name2 = new ArrayList<String>();
    name2.add("Zorro");
    name2.add("zero");
    name2.add("zippy");
        
        testcountZnames(name, 0);
        testcountZnames(name2, 14);
    }
}