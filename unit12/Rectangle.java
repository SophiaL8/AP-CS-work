public class Rectangle{
    private double width;
    private double height;
    private String name;
    public Rectangle(String name, double height, double width){
        this.name = name;
        this.height = height;
        this.width = width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth(){
        return width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public double area(){
        return width * height;
    }
    public double perimeter(){
        return 2*(width + height);
    }
        public static double averagePerimeter(Rectangle [][] rectangles){
        int totalRect = 0;
        double totalPerimeter = 0;
        
        for(Rectangle[] row: rectangles){
            for(Rectangle rectangle : row){
                totalPerimeter += rectangle.perimeter();
                totalRect++;
            }
        }
        return totalPerimeter/totalRect;
        
    }
    public static String greatestArea(Rectangle [][] rectangles){
        double maxValue = Double.MIN_VALUE;
        String nameofRect = "";
        for(Rectangle [] row: rectangles){
            for(Rectangle rectangle: row){
                double area = rectangle.area();
                if(area > maxValue){
                    maxValue = area;
                    nameofRect = rectangle.getName();
                }
            }
        }
        return nameofRect;
    }
    public static void main(String [] args){
        Rectangle[][] RectArray = {{new Rectangle("Rect1", 3.0, 4.0), new Rectangle("Rect2", 5.0, 2.0)},{new Rectangle("Rect3", 7.0, 1.0), new Rectangle("Rect4",2.0, 7.0)}};
        
        System.out.println("Average perimeter " + averagePerimeter(RectArray));
        System.out.println("Greatest area " + greatestArea(RectArray));
    }
}