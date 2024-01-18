public class Cat extends Animal //subclass
{
    public Cat(String name, int legCount, boolean furriness)
    {
        //this.name = name; // we want to do this

        super(name, legCount, furriness);
        
    }

    // overrides Person.hello()

    public void fullout()
    {
        System.out.println("Animal Name: " + getName() + " Leg Count: " + getlegCount() + " Furriness: " + getfurriness());
    }

}
