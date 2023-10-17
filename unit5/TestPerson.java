public class TestPerson{

    public static void main(String [] args){
        Person s = new Person("Sophia", 20);
        
        s.greeting();
        
        s.setName("Sara");
        s.getName();
        
        s.setNumOfPets(18);
        s.getNumOfPets();
        
        s.greeting();
    }
}