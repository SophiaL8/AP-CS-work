public class TestRectangle{
    public static void testrectangle(Rectangle r, double expectedA, double expectedp, double expectedd){
        double are = r.area();
        double per = r.perimeter();
        double diag = r.diagonal();
        System.out.println("Rectangle base:" + r.getbase() + " Rectangle height: "+ r.getheight() + " Expected Area: " + expectedA + " Area: " + are + " Expected perimeter: " + expectedp + " Perimeter: " + per + " Expected Diagonal: " + expectedd + " Diagonal: " + diag);
        
    }
    public static void main(String [] args){
        Rectangle rOne = new Rectangle(3, 4);
        testrectangle(rOne, 12, 14, 5);
        
        Rectangle rTwo = new Rectangle(6, 8);
        testrectangle(rTwo, 48, 28, 10);
    }
}