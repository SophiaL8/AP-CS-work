public class HelloRandom{
    public static void main(String [] args){
        for(int i=0;i<5; i++)
            System.out.println(Math.random()); // random # in [0,1)
        
         for(int i=0;i<5; i++){
        int r = (int)(Math.random()*10 + 1);
        System.out.println(r);
         }
        
    }
}