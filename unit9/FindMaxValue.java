import java.util.*;
public class FindMaxValue{
    public static void testfindMax(double [] values, double expected){
        double result = findMax(values);
        
        for(double x: values){
            System.out.println(x);
        }
System.out.println("Expected: " + expected + " Result: " + result);
    }
    public static double findMax(double [] values){
        double largest = values[0];
        for(double x: values){
            if(x>largest){
                largest = x;
            }
        }
        return largest;
    }
    public static void main(String [] args){
    double[] values = {1.0, 2.1, 5.3};
    double[] values2 = {0.0, -35.0, 90.1};
        
    double largest = findMax(values);
    System.out.println("Max: " + largest);
    testfindMax(values, 5.3);
        
    double largest2 = findMax(values2);
    System.out.println("Max: " + largest2);
    testfindMax(values2, 90.1);
    }
}