public class GoodDeal{
    public static void TestgoodDeal(double originalPrice, double salesPrice, boolean expected){
        boolean result = goodDeal(originalPrice, salesPrice);
            
            System.out.println("Original Price: " + originalPrice + " Sales Price: " + salesPrice + " Expected: " + expected + "Result: " + result);
    }
    public static boolean goodDeal(double originalPrice, double salesPrice){
        if(salesPrice< 0.75*originalPrice){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String [] args){
        TestgoodDeal(50, 25, true);
        TestgoodDeal(75, 56, true);
        TestgoodDeal(88.9, 67, false);
        TestgoodDeal(71.25, 95, false);
    }
}