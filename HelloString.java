public class HelloString{
    
    public static void main(String[] args){
        String s = "Hello, world!";
        System.out.println(s);
        
        System.out.println(s.substring(0,5)); //[begin, end]
        System.out.println(s.substring(7)); //defaul: end == size
        //if you do one number last number goes to the end of the string
        System.out.println("Size: " + s.length());
        
        String t = s.substring(0,5);
        System.out.println(t);
        
        String u = "Hello";
        System.out.println("u: " + u);
        System.out.println("t==u:" + (t==u));
        System.out.println("t.equals(u): " + t.equals(u));
    }
}