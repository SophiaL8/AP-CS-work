public class Rectangle
{
    public Rectangle(double baseIn, double heightIn)
    {
        base = baseIn;
        height = heightIn;
    }
    public double getbase(){
        return base;
    }
    public void setbase(double baseIn){
        base = baseIn;
    }
    public double getheight(){
        return height;
    }
    public void setheight(double heightIn){
        height = heightIn;
    }
    public double area(){
        return base*height;
    }
    public double perimeter(){
        return (2*base) + (2*height);
    }
    public double diagonal(){
        return Math.hypot(base, height);
    }
    
    private static double base;
    private static double height;
}