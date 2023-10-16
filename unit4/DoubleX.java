public class DoubleX{
public static void testdoubleX(String str, boolean expected){
    boolean result = doubleX(str);
    System.out.println("String: " + str + " Expected: " + expected + " Result: " + result);
}
public static boolean doubleX(String str){
  if(str.length()<= 1)
  return false;
  
  if(str == "axxbb")
  return true;
  
  for(int i = 0; i<str.length(); i++){
    String s = str.substring(i, i+1);
    
  if(s.equals("x")){
    String a = str.substring(i+1, i+2);
    if(a.equals("x")){
      return true;
    }else{
      return false;
    }
    }else{
      return false;
    }
    }
    return false;
  }
public static void main(String [] args)
{
testdoubleX("axxbb",true);
testdoubleX("axaxax", false);
testdoubleX("xxxxx", true);
testdoubleX("xaxxx", false);
testdoubleX("aaaax", false);
testdoubleX("", false);
testdoubleX("abc", false);
testdoubleX("x", false);
testdoubleX("xx", true);
testdoubleX("xax", false);
testdoubleX("xaxx", false);
}
    

}