public class CoinFlip{
    public static void main(String [] args){
        for(int i = 0; i<= 20; i++){
            int r = (int)(Math.random()*2 + 1);
            
            if(r == 1){
                System.out.println("Heads!");
            }else if(r == 2){
                System.out.println("Tales!");
            }
        }
    }
}