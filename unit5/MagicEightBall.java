public class MagicEightBall{
/*public String MagicEightBall(String questionIn){
    int shake = (int)(Math.random() * 6);
    
    if(shake== 0){
        return "The Magic Eight Ball Says: " + MagicEightBall.zero;
        }else if(shake == 1){
                return "The Magic Eight Ball Says: " + MagicEightBall.one;
        }else if(shake == 2){
                return "The Magic Eight Ball Says: " + MagicEightBall.two;
        }else if(shake == 3){
                return "The Magic Eight Ball Says: " + MagicEightBall.three;
        }else if(shake == 4){
                return "The Magic Eight Ball Says: " + MagicEightBall.four;
        }else if(shake == 5){
                return "The Magic Eight Ball Says: " + MagicEightBall.five;
        }else if(shake == 6){
                return "The Magic Eight Ball Says: " + MagicEightBall.six;
        }else{
        return "I can not predict this";
    }
 }
 */
public void MagicEightBall(String questionIn){
        question = questionIn;
        System.out.println("You asked: " + question);
}

public String ask(){
        int shake = (int)(Math.random() * 7);
    
    if(shake == 0){
        return "The Magic Eight Ball Says: " + zero;
        }else if(shake == 1){
                return "The Magic Eight Ball Says: " + one;
        }else if(shake == 2){
                return "The Magic Eight Ball Says: " + two;
        }else if(shake == 3){
                return "The Magic Eight Ball Says: " + three;
        }else if(shake == 4){
                return "The Magic Eight Ball Says: " + four;
        }else if(shake == 5){
                return "The Magic Eight Ball Says: " + five;
        }else if(shake == 6){
                return "The Magic Eight Ball Says: " + six;
        }else{
        return "I can not predict this";
    }
}
    private String question;
    public static final String zero = "There is no perfect answer for that";
    public static final String one = "Try again later";
    public static final String two = "The answer is yes";
    public static final String three = "Definitely yes!";
    public static final String four = "All signs point to no!";
    public static final String five = "Maybe";
    public static final String six = "The answer is no";
}