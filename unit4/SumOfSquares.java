public class SumOfSquares{
public static void testSumOfSquares(int n, int expected){
    int result = sumOfSquares(n);
    
    System.out.println("Int: " + n + " Expected: " + expected + " Result: " + result);
}
   public static int sumOfSquares(int n){
        int square = 0;
        for(int i = 1; i<=n; i++){
            square += (i*i);
        }
        return square;
    }
    public static void main(String [] args){
        testSumOfSquares(1, 1);
        testSumOfSquares(2, 5);
        testSumOfSquares(3, 14);
        testSumOfSquares(4, 30);
        testSumOfSquares(5, 55);
    }
}