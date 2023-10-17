public class Person
{
    public Person(String nameIn, int numofpetsIn){
        name = nameIn;
        numofpets = numofpetsIn;
    }
    public void greeting()
    {
        System.out.println("Hello, my name is " + name + " and I have " + numofpets + " pets.");
        
    }
    public int getNumOfPets(){ //accessor function
        return numofpets;
    }
    
    public void setNumOfPets(int numofpetsIn){ //mutator function
        numofpets = numofpetsIn;
    }
    public void setName(String nameIn){
        name = nameIn;
    }
    public String getName(){
        return name;
    }
        //public String name;//dont do this: no private variable
        private String name;//private member variable
        private int numofpets;

}