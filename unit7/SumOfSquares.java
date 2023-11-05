public class SumOfSquares{
    public static void testsumofsquares(double [] nums, double expected){
        double result = sumOfSquares(nums);
            
        for(double x: nums){
            System.out.println(x);
        }
        System.out.println("Expected: " + expected + " Result: " + result);
    }
    public static double sumOfSquares(double [] nums){
    double sum = 0;
        for(int i = 0; i<nums.length; i++){
            double squares = nums[i] * nums[i];
            
            sum += squares;
        }
        return sum;
    }
    public static void main(String[] args){
        double[] numbers = {0};
        double[] numbers2 = {1.0, 2.0, 3.0};
        double[] numbers3 = {2.0, 2.0, 2.0};
        
        testsumofsquares(numbers, 0);
        testsumofsquares(numbers2, 14.0);
        testsumofsquares(numbers3, 12.0);
    }
}