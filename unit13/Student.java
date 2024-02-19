public class Student{
    public Student(String name, int favNum){
        this.name = name;
        this.favNum = favNum;
    }
    
    public String getName() {return name;}
    public int getfavNum() {return favNum;}
    
    private String name;
    private int favNum;
}