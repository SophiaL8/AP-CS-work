import java.util.*;
public class AcademicClass{
    public AcademicClass(Teacher teacher){
        this.teacher = teacher;
        student = new ArrayList<Student>();
    }
    public void addStudent(String name, int favNum){
        Student students = new Student(name, favNum);
        student.add(students);
    }
    public void info(){
        System.out.println("The teacher: " + teacher.getName() + " Subject: " + teacher.getSubject());
        System.out.println("The Students:");
        for(Student s: student){
            System.out.println(s.getName());
        }
    }
    public ArrayList<String> favnumbers(int n){
        ArrayList<String> studentss = new ArrayList<String>();
        for(Student s: student){
            if(s.getfavNum() == n){
                studentss.add(s.getName());
            }
        }
        return studentss;
    }
    public ArrayList<String> oddNum(){
        ArrayList<String> studentss = new ArrayList<>();
        for(Student s: student){
            if((s.getfavNum() % 2) == 1){
               studentss.add(s.getName()); 
            }
        }
        return studentss;
    }
    
    private Teacher teacher;
    private ArrayList<Student> student;
    
    public static void main(String[] args){
        Teacher teacher = new Teacher("Dr. Kessner", "APCS");
        AcademicClass APCS = new AcademicClass(teacher);
        
        APCS.addStudent("Sophia", 8);
        APCS.addStudent("Elle", 43);
        APCS.addStudent("Wollie", 9);
        APCS.addStudent("Alice", 28);
        APCS.addStudent("Harker", 8);
        
        APCS.info();
        System.out.println("Students whos favorite number is 8" + APCS.favnumbers(8));
        System.out.println("Students whos favorite number is odd" + APCS.oddNum());
    }
}