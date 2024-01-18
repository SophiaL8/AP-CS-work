public class Animal{
    public Animal(String name, int legCount, boolean furriness){
        this.name = name;
        this.legCount = legCount;
        this.furriness = furriness;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setlegCount(int legCount){
        this.legCount = legCount;
    }
    public int getlegCount(){
        return legCount;
    }
    public void setfurriness(boolean furriness){
        this.furriness = furriness;
    }
    public boolean getfurriness(){
        return furriness;
    }
    
    private String name;
    private int legCount;
    private boolean furriness;
}