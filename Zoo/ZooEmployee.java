package Zoo;
import java.util.ArrayList;
import java.util.List;
import Zoo.Animal;


//Abstraction for Zookeeper class (Abstract class).
public abstract class ZooEmployee
{
	protected String name;
	public List<Animal> Animal_list = new ArrayList<Animal>();
	public ZooEmployee(String myName, List<Animal> mylist)
	{
		this.name = myName;
		this.Animal_list = mylist;
	}
	//Encapsulation for name
	public String get_name()
	{
		return this.name;
	}
}