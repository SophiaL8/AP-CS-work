import java.util.*;
public class FilteringAList{
    public static void TestGoodScores(int[] values, ArrayList<Integer> expected){
        ArrayList<Integer> result = filterGoodScores(values);
        
        for(int x: values){
            System.out.println(x);
        }
System.out.println("Expected: " + expected + " Result: " + result);
    }
    public static ArrayList<Integer> filterGoodScores(int [] values){
        ArrayList<Integer> good = new ArrayList<Integer>();
        
        for(int x: values){
            if(x>90)
                good.add(x);
        }
        return good;
    }
    
    public static ArrayList<Integer> filterGood(int[] values){
        ArrayList<Integer> good = new ArrayList<Integer>();
        
        for(int x: values){
            if(x>= 100)
                good.add(x);
        }
        return good;
    }
    public static void main(String[] args){
        int[] values = {51, 52, 53, 100};
        int[] values2 = {92, 89, 90, 99};
        
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(100);
        
        ArrayList<Integer> expected2 = new ArrayList<>();
        expected2.add(92);
        expected2.add(99);
        
        
        ArrayList<Integer> goodScores = filterGoodScores(values);
        System.out.println("Good Scores: " + goodScores);
        System.out.println();
        
        TestGoodScores(values, expected);
        TestGoodScores(values2, expected2);
    }
}