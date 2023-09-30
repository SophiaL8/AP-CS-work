public class HelloMath{
    
    public static void main(String [] args){
        System.out.println("Hello, math!");
        System.out.println(Math.PI);
        System.out.println(Math.E);
        
        System.out.println(Math.cos(0));
        System.out.println(Math.cos(Math.PI));
        
        System.out.println(Math.sin(0));
        System.out.println(Math.sin(Math.PI));
        
        //unit testing with round off error
        
        double result = Math.sin(Math.PI);
        double expected = 0.0;
        
        if(Math.abs(result-expected)<le-6){ //check if result is close
            System.out.println("Yayyyy");
        }else{
            System.out.println("BOOOO HOO"); // you cant do exact comparisons when you have round off error
        }
    }
}