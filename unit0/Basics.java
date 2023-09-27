public class Basics{
    
    public static void main(String [] args){
        for(int i= 0; i<10; i++){
            //System.out.println(i);
            
            if(i%2 == 0)
                System.out.println("Even");
            else if(i == 7)
                System.out.println("Lucky");
                else
                    System.out.println(i);
            //Need to have everything inside braces if want to do multiple things in loop
            //Can do one thing without the braces
        }
    }
}