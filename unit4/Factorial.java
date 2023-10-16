public class Factorial{
    public static void testfactorial(int n, int expected){
        int result = factorial(n);
        System.out.println("Integer: " + n + " Expected: " + expected + " Result: " + result);
    }
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i<= n; i++){
            fact = fact*i;
        }
        return fact;
    }
    
    public static void main(String [] args){
        testfactorial(0, 1);
        testfactorial(1, 1);
        testfactorial(2, 2);
        testfactorial(3, 6);
        testfactorial(4, 24);
        testfactorial(5, 120);
        testfactorial(6, 720);
        testfactorial(7, 5040);
    }
}