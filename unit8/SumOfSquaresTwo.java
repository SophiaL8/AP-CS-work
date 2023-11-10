import java.util.*;
public class SumOfSquaresTwo{
    public static void testsumofsquares(ArrayList<Double> nums, double expected){
        double result = sumOfSquares(nums);
            
        for(double x: nums){
            System.out.println(x);
        }
        System.out.println("Expected: " + expected + " Result: " + result);
    }
    public static double sumOfSquares(ArrayList<Double> nums){
    double sum = 0;
        for(double num : nums){
            double squares = num * num;
            
            sum += squares;
        }
        return sum;
    }
    public static void main(String[] args){
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(0.0);
        
        ArrayList<Double> numbers2 = new ArrayList<>();
        numbers2.add(1.0);
        numbers2.add(2.0);
        numbers2.add(3.0);
        
        ArrayList<Double> numbers3 = new ArrayList<>();
        numbers3.add(2.0);
        numbers3.add(2.0);
        numbers3.add(2.0);
        
        testsumofsquares(numbers, 0);
        testsumofsquares(numbers2, 14.0);
        testsumofsquares(numbers3, 12.0);
    }
}