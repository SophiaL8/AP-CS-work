public class Centipede extends Animal //subclass
{
    public Centipede(String name, int legCount, boolean furriness)
    {
        //this.name = name; // we want to do this

        super(name, legCount, furriness); // call superclass constructor
        
    }

    // overrides Person.hello()

    public void fullout()
    {
        System.out.println("Animal Name: " + getName() + " Leg Count: " + getlegCount() + " Furriness: " + getfurriness());
    }

}
