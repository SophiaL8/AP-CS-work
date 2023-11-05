public class CountLucky{
public static void testcountLucky(int [] nums, int expected){
    int result = countLucky(nums);
    
    for(int x: nums)
        System.out.println(x);
    
    
    System.out.println("Expected: " + expected + " Result: " + result);
}
public static int countLucky(int [] nums){
    int count = 0;
    for(int i = 0; i< nums.length; i++){
        if(nums[i] % 7 == 0|| nums[i] % 10 == 7){
            count ++;
        }
    }
    return count;
}
    
public static void main(String[] args){
    int[] numbers ={1, 2, 3};
    int[] numbers2 = {7, 13, 17};
    int[] numbers3 = {107, 207};
    
    testcountLucky(numbers, 0);
    testcountLucky(numbers2, 2);
    testcountLucky(numbers3, 2);
}
}