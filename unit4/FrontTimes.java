public class FrontTimes{
    public static void testfrontTimes(String str, int n, String expected){
        String results = frontTimes(str, n);
        System.out.println("String: " + str + " Copies: " + n + " Expected: " + expected + " Results: " + results);
    }
    public static String frontTimes(String str, int n) {
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
    public static void main(String [] args){
        testfrontTimes("Chocolate", 2, "ChoCho");
        testfrontTimes("Chocolate", 3, "ChoChoCho");
        testfrontTimes("Abc", 3, "AbcAbcAbc");
    }
}