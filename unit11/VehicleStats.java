import java.util.*;

public class VehicleStats{
    public static double averageWheels(ArrayList<Vehicle> vehicles){
        double sum = 0;
        for(Vehicle v: vehicles)
            sum+= v.wheelCount();
        return sum / vehicles.size();
    }
    public static ArrayList<String> humanPowered(ArrayList<Vehicle> vehicles){
        ArrayList<String> humanPow = new ArrayList<>();
        for(Vehicle v: vehicles){
            if(v.isHumanPowered() == true){
                humanPow.add(v.name());
            }
        }
        return humanPow;
    }
    public static void main(String[] args){
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Car("Honda", 4, false));
        vehicles.add(new Motorcycle("thing", 2, false));
        vehicles.add(new Bicycle("Swish", 2, true));
        vehicles.add(new Unicycle("reduni", 1, true));
        
        System.out.println("Average wheels" + averageWheels(vehicles));
        System.out.println("Human powered vehicles: " + humanPowered(vehicles));
        for(Vehicle v : vehicles)
        {
            System.out.println(v.name());
            System.out.println(v.wheelCount());
            System.out.println(v.isHumanPowered());
        }
        
    }
}