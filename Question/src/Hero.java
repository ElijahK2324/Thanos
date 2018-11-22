
public class Hero {
	
	private String name;
	private String power;
	private int age;

	public Hero()
	{
		name = "billy bob";
		power = "has infinity gauntlet";
		age = 20;
		health = 100;
		dmgPerHit = 10;
	}
	
	public Hero(String name, String power, int age)
	{
		this.name = name;
		this.power = power;
		this.age = age;
	}
	
	public String toString()
	{
		return "name: " + name + " \npower: " + power + " \nage: " + age;
	}
	
	
}
