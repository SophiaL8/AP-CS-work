public class MissingChar{

public static void testmissingChar(String str, int n, String expected){
    String result = missingChar(str, n);
    
    System.out.println("String: " + str + " Char at Index Removed: " + n + " Expected: " + expected + " Result: " + result);
}
public static String missingChar(String str, int n) {
  String add = str.substring(0, n);
  String subtract = str.substring(n+1);
  
  return add + subtract;
}

public static void main(String [] args){
    testmissingChar("kitten", 1, "ktten");
    testmissingChar("kitten", 0, "itten");
    testmissingChar("kitten", 4, "kittn");
}
}
