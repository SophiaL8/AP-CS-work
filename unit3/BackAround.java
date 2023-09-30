public class BackAround{

public static void testbackAround(String str, String expected){
    String result = backAround(str);
    
    System.out.println("Original String: " + str + " Expected String: " + expected + " Result: " + result);
}

public static String backAround(String str) {
  String add = str.substring(str.length() -1);
  return add + str + add;
}
    
public static void main(String [] args){
    testbackAround("cat", "tcatt");
    testbackAround("Hello", "oHello");
    testbackAround("a", "aaa");
}
}
