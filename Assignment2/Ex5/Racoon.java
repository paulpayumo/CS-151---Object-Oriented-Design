public class Racoon extends Animal{
	public Racoon(String name, String type, int age, String gender, String location, int speed)
	{
		super(type, name, age, gender, location, speed);
	}
	
	public void scratch()
	{
		sop("I AM SCRATCHING YOU");
	}
	
	public void dumpsterDive()
	{
		sop("I am a raccoon, it only makes sense that I also dumpster dive");
	}
}
