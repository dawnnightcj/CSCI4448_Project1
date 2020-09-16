package Zoo.Animals.Felines;
import Zoo.Animals.Feline;
import java.util.Random;

public class Cat extends Feline
{
    public Cat(String name) 
    { 
        super(name);
    } 
    public void sleep()
    {
    	Random rand = new Random(); 
    	double rand_num = rand.nextDouble();
    	if(rand_num < 0.3)
    		this.roam();
    	else if(rand_num < 0.6)
    		this.makeNoise();
    	else
    		System.out.println(this.name+" the cat is asleep ZZZ");
    }
}
