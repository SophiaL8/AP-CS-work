import java.util.*;

public class AnimalCalculator{
   public static double averageLegs(ArrayList<Animal> animal){
       double sum = 0;
       for(Animal a: animal){
           sum+=a.getlegCount();
       }
       return sum/animal.size();
   }
    public static String largestAmLegs(ArrayList<Animal> animal){
        int max = Integer.MIN_VALUE;
        String finish = "";
        for(Animal a: animal){
        if(max < a.getlegCount()){
            max = a.getlegCount();
            finish = a.getName();
            }
        }
        return finish;
    }
    public static void main(String [] args){
        ArrayList <Animal> animal = new ArrayList<Animal>();
        animal.add(new Human("Sophia", 2, false));
        animal.add(new Cat("Shaye", 4, true));
        animal.add(new Sponge("Squish", 0, false));
        animal.add(new Centipede("Hehe", 10, true));
        
        System.out.println("Largest Amount of Legs:" + largestAmLegs(animal));
        System.out.println("Average Legs: " + averageLegs(animal));
        for (Animal a : animal)
        {
            System.out.println(a.getName());
            System.out.println(a.getlegCount());
            System.out.println(a.getfurriness());
            System.out.println();
        }
    }
}