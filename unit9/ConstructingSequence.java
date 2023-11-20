import java.util.*;
public class ConstructingSequence{
    public static ArrayList<Integer> fibonacci(int n){
        ArrayList<Integer> more = new ArrayList<Integer>();
        int a = 1;
        int b = 1;
        
        if(n>= 2){
            more.add(b);
        }
        if(n>=2){
            more.add(b);
        }
        for(int i = 2; i<n; i++){
            int c = a + b;
            more.add(c);
            a=b;
            b=c;
        }
        return more;
    }
    public static void main(String[] args){
        ArrayList<Integer> sequence = fibonacci(2);
        System.out.println("Fibonacci seqience: " + sequence);
        
        ArrayList<Integer> sequence2 = fibonacci(3);
        System.out.println("Fibonacci seqience: " + sequence2);
        
        ArrayList<Integer> sequence3 = fibonacci(4);
        System.out.println("Fibonacci seqience: " + sequence3);
        
        ArrayList<Integer> sequence4 = fibonacci(5);
        System.out.println("Fibonacci seqience: " + sequence4);
    }
}