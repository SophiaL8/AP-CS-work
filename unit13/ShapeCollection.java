import java.util.*;

public class ShapeCollection{
    public ShapeCollection(){
        shapes = new ArrayList<Shape>();
    }
    public void addShape(String name, int sides){
        Shape shapee = new Shape(name, sides);
        shapes.add(shapee);
    }
    
    public int numberOfSides(String shapeName){
        for(Shape s: shapes){
            if(s.getName() == shapeName){
                return s.getSides();
            }
        }
        return -1;
    }
    public double AvgSides(){
        int sum = 0;
        for(Shape s: shapes){
            sum += s.getSides();
        }
        return (double)sum/shapes.size();
    }
    
    public ArrayList<Shape> evenSides(){
        ArrayList<Shape> shapeS = new ArrayList<Shape>();
        for(Shape s: shapes){
            if((s.getSides() % 2) == 0){
                shapeS.add(s);
            }
        }
        return shapeS;
    }
    private ArrayList<Shape> shapes;
    
    public static void main(String [] args){
        ShapeCollection coll = new ShapeCollection();
        coll.addShape("Rectangle", 4);
        coll.addShape("Circle", 0);
        coll.addShape("Hexagon", 6);
        coll.addShape("Pentagon", 5);
        
        System.out.println(coll.AvgSides());
        System.out.println(coll.evenSides());
        System.out.println(coll.numberOfSides("Rectangle"));
        System.out.println(coll.numberOfSides("Circle"));
        System.out.println(coll.numberOfSides("Hexagon"));
        System.out.println(coll.numberOfSides("Dog"));
    }
}