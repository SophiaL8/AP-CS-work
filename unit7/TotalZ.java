public class TotalZ{
    public static void testcountZnames(String [] names, int expected){
        int result = countZnames(names);
        
        for(String z: names){
            System.out.println(z);
        }
        System.out.println("Expected: " + expected + " Result: " + result);
    }
    public static int countZnames(String [] names){
    int namelength = 0;
        for(int i = 0; i<names.length; i++){
            char letter = names[i].charAt(0);
            if(letter == 'Z' || letter == 'z'){
                namelength += names[i].length();
            }
        }
        return namelength;
    }
    public static void main(String[] args){
String[] name = {"Dr. Kessner", "Dr. Sands"};
String[] name2 = {"Zorro", "zero", "zippy"};
        
        testcountZnames(name, 0);
        testcountZnames(name2, 14);
    }
}