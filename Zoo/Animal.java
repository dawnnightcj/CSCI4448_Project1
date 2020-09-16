package Zoo;

//Abstraction for different animals. 
public abstract class Animal 
{ 
    protected String name;  
    public Animal(String myName)
    { 
        this.name = myName; 
    }
    public String get_name()
    {
    	return this.name;
    }
    public String get_type()
    {
    	return this.getClass().getSimpleName();
    }
    public void exercise()
    {
    	System.out.println(this.name+" the "+this.get_type()+" is lifting weight");
    }
    public void wake()
    {
    	System.out.println(this.name+" the "+this.get_type()+" is awake");
    }
    public void sleep()
    {
        System.out.println(this.name+" the "+this.get_type()+" is asleep ZZZ");
    }
    public void makeNoise()
    {
        System.out.println(this.name+" the "+this.get_type()+" is making noise");
    }
    public void eat()
    {
        System.out.println(this.name+" the "+this.get_type()+" is eating");
    }
}