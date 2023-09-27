public class HelloFunctions{
    public static void hello()
    {
        //void means not returning anything from functions
        System.out.println("Hello, world!");
    }
    public static void hello(String name)
    {
        //void means not returning anything from functions
        System.out.println("Hello" + name + "!");
        //overloaded function
    }
    
    public static int triple(int n)
    {
        return 3*n;
    }
    
    public static void main(String[]args){
        hello(); //call the function hello()
        hello();
        hello("Nina");
        
        for(int i =0; i<5; i++){
             System.out.println(i + " " + triple(i));
        }
    }
}