public class Dog extends Animal implements Domesticated
{
	private String temperament;
	
	public Dog(String name, String temperament, String type, int age, String gender, String location, int speed)
	{
		super(type, name, age, gender, location, speed);
		this.temperament = temperament;
	}
	
	public String getTemperament()
	{
		return temperament;
	}
	
	public void setTemperament(String newTemperament)
	{
		this.temperament = newTemperament;
	}
	
	public void walk()
	{
		sop("I am walking");
	}
	
	public void greetHuman()
	{
		sop("HELLO HOOMAN");
	}
	
	public void swim()
	{
		sop("Look I am doggy paddeling");
	}
	
	public void bark()
	{
		sop("WOOF woof wOof");
	}
	
	public String toString()
	{
		String myString = super.toString();
		return myString + "I am also " + this.getTemperament();
	}
}
