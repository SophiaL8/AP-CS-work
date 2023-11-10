import java.util.*;
public class CountLuckyTwo{
public static void testcountLucky(ArrayList<Integer> nums, int expected){
    int result = countLucky(nums);
    
    for(int x: nums)
        System.out.println(x);
    
    
    System.out.println("Expected: " + expected + " Result: " + result);
}
public static int countLucky(ArrayList<Integer> nums){
    int count = 0;
    for(int num : nums){
        if(num % 7 == 0|| num % 10 == 7){
            count ++;
        }
    }
    return count;
}
    
public static void main(String[] args){
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    
    ArrayList<Integer> numbers2 = new ArrayList<>();
    numbers2.add(7);
    numbers2.add(13);
    numbers2.add(17);
    
    ArrayList<Integer> numbers3 = new ArrayList<>();
    numbers3.add(107);
    numbers3.add(207);
    
    testcountLucky(numbers, 0);
    testcountLucky(numbers2, 2);
    testcountLucky(numbers3, 2);
}
}