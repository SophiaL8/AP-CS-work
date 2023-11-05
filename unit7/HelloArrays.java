public class HelloArrays{
    public static void main(String [] args){
        int [] values = {1, 3, 5, 7}
        
        for(int n : values) //for each loop
        {
            System.out.println(n);
        }
        System.out.println(values.length);
    }
}