public class Animal 
{
	private String type;
	private String name;
	private int age;
	private String gender;
	private String environment;
	private int speed;
	
	public Animal(String type, String name, int age, String gender, String environment, int speed)
	{
		this.type = type;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.environment = environment;
		this.speed = speed;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	public void setEnvironment(String location)
	{
		environment = location;
	}
	
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	
	public String getType()
	{
		return this.type;
	}
	public String getName()
	{
		return this.name;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public String getEnvironment()
	{
		return this.environment;
	}
	
	public String getGender()
	{
		return this.gender;
	}
	
	public int getSpeed()
	{
		return this.speed;
	}
	
	public void sop(Object msg)
	{
		System.out.println(msg);
	}
	
	public void move()
	{
		sop("Moving");
	}
	
	public void sound()
	{
		sop("Making noise");
	}
	
	public void eat()
	{
		sop("Eating");
	}
	
	public void sleep()
	{
		sop("Sleep");
	}
	
	public String toString()
	{
		String myVariables = "I am a " + this.getType() + ". My name is " + this.getName() +" and I am " + this.getAge() + " years old. I am a " + this.getGender() + " and I live in a/an " + this.getEnvironment() + ". I can move at " + this.getSpeed() + "mph.";
		return myVariables;
	}
}
