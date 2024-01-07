import java.util.*;
public class PersonStats{
    public static void print(ArrayList<Person> persons){
        for(Person a: persons){
            System.out.println(a.name() + " " + a.pets());
        }
    }
    public static void PersonStatsTest(ArrayList<Person> persons,  double expected, String expected2, String expected3){
        Double result1 = averageNum(persons);
        String result2 = mostPets(persons);
        ArrayList<String> results3 = atLeastTwo(persons);
        
        System.out.println("Expected 1 " + expected + " Result: " + result1 + " Expected 2 " + expected2 + " Result: " + result2 + " Expected 3 " + expected3 + " Result: " + results3);
    }
    public static double averageNum(ArrayList<Person> persons){
        double sum = 0;
        for(Person a : persons)
            sum += a.pets();
        return sum/persons.size();
    }
    public static String mostPets(ArrayList<Person> persons){
        int max = Integer.MIN_VALUE;
        String fin = "";
        for(int i = 0; i < persons.size(); i++){
        if(max < persons.get(i).pets()){
            max = persons.get(i).pets();
            fin = persons.get(i).name();
            }
        }
        return fin;  
    }

    public static ArrayList<String> atLeastTwo(ArrayList<Person> persons){
        ArrayList<String> done = new ArrayList<>();
        for(int i = 0; i<persons.size(); i++){
            if(2 <= persons.get(i).pets()){
                done.add(persons.get(i).name());
            }
        }
        return done;
    }
    public static void main(String[] args){
        Person Sophia = new Person("Sophia", 20);
        Person Charlie = new Person("Charlie", 5);
        Person Katelyn = new Person("Katelyn", 2);
        Person Mai = new Person("Mai", 1);
        
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(Sophia);
        persons.add(Charlie);
        persons.add(Katelyn);
        persons.add(Mai);
        print(persons);
        
        System.out.println("Average number of pets " + averageNum(persons));
        
        System.out.println("Person who has most pets: " + mostPets(persons));
        
        System.out.println("Array of people with over 2 pets" + atLeastTwo(persons));
        
        PersonStatsTest(persons, 7.0, "Sophia", "Sophia Charlie Katelyn");
    }
}
