public class StringTimes{
public static void testStringTimes(String str, int n, String expected){
    String end = stringTimes(str, n);
    System.out.println("String: " + str + " Copies: " + n + " Expected: " + expected + " Result: " + end);
}
public static String stringTimes(String str, int n){
  String result = "";
  for(int i=0; i<n; i++){
    result = result + str;
  }
  return result;
}
    public static void main(String [] args){
    testStringTimes("Hi", 2, "HiHi");
    testStringTimes("Hi", 3, "HiHiHi");
    testStringTimes("Hi", 1, "Hi");
}
}







/*
public String frontTimes(String str, int n) {
  String result = "";   
  int front = 3;
  if(str.length() < front){
    front = str.length();
  }
  
  for(int i = 0; i<n; i++){
      String s = str.substring(0, front);
    result = result + s;
  }
  return result;
}
*/