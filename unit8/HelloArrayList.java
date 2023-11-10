import java.util.*;


public class HelloArrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Nola");
        names.add("Nina");
        names.add("Mia");

        for (String name : names)
        {
            System.out.println(name);
        }

        System.out.println("size: " + names.size());

        names.remove("Nola");

        for (int i=0; i<names.size(); i++)
        {
            String name = names.get(i);
            System.out.println(name);

            // or:
            //System.out.println(names.get(i);
        }

        ArrayList<Integer> values = new ArrayList<Integer>(); 
        values.add(5);
        values.add(3);

        for (int n : values)
            System.out.println(n);

        

    }
}

