public class Cat extends Animal implements Domesticated{
	private String temperament;
	
	public Cat(String temperament, String type, String name, int age, String gender, String location, int speed)
	{
		super(type, name, age, gender, location, speed);
		this.temperament = temperament;
	}
	
	public void walk()
	{
		sop("I am walking.");
	}
	
	public void greetHuman()
	{
		sop("Do cats really greet humans though?");
	}
	
	public void scratch()
	{
		sop("IMMA SCRATCH YOU");
	}
	
	public String getTemperament()
	{
		return temperament;
	}
	
	public void setTemperament(String newTemperament)
	{
		this.temperament = newTemperament;
	}
	public String toString()
	{
		String myString = super.toString();
		return myString + "I am also " + this.getTemperament() + ".";
	}
}

