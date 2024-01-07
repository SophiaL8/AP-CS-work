import java.util.*;
public class ItemCalculator{
    public static void print(ArrayList<Item> items){
        for(Item a: items){
            System.out.println(a.name() + " " + a.price());
        }
    }
    public static void ItemCalculatorTest(ArrayList<Item> items, float expected){
        float result1 = averageAge(items);
        
        System.out.println("Expected1: " + expected + "Result: " + result1);
    }
    
    public static void ItemCalculatorTest2(ArrayList<Item> items,  String alsoexpected){
        String result2 = expensive(items);
        
        System.out.println("Expected2 " + alsoexpected + "Result: " + result2);
    }
    public static float averageAge(ArrayList<Item> items){
        float sum = 0;
        for(Item a: items)
            sum+= a.price();
        return sum / items.size();
    }
    public static String expensive(ArrayList<Item> items){
        float max = items.get(0).price();
        String result = "";
        for(int i = 0; i<items.size(); i++){
            if (max < items.get(i).price()){
                max = items.get(i).price();
                result = items.get(i).name();
            }
        }
        return result;
    }
    public static void main(String[] args){
        Item plant = new Item("Plant", 12f);
        Item drink = new Item("drink", 5f);
        Item phone = new Item("phone", 900f);
        Item phonecase = new Item("phonecase", 15f);
        
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(plant);
        items.add(drink);
        items.add(phone);
        items.add(phonecase);
        
        print(items);
        System.out.println("average age: " + averageAge(items));
        System.out.println("most expensive item: " + expensive(items));
        
        ItemCalculatorTest(items, 233);
        ItemCalculatorTest2(items, "phone");
    }
}