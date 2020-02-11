public class AnimalTest 
{
	public static void sop(Object msg)
	{
		System.out.println(msg);
	}
	
	public static void sop()
	{
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		Dog doge = new Dog("Doge", "Jolly", "Dog", 2 , "Male", "Home", 10);
		sop(doge.toString());
		doge.bark();
		doge.eat();
		doge.greetHuman();
		doge.walk();
		doge.sleep();
		doge.move();
		doge.sound();
		doge.swim();
		sop();
		
		Cat kitty = new Cat("Laaazy", "Cat", "Kitty", 1, "Female", "Home", 5);
		sop(kitty.toString());
		kitty.eat();
		kitty.greetHuman();
		kitty.walk();
		kitty.sleep();
		kitty.move();
		kitty.sound();
		kitty.scratch();
		sop();
		
		Racoon sly = new Racoon("Sly", "Racoon", 5, "Male", "forest", 7);
		sop(sly.toString());
		sly.eat();
		sly.sleep();
		sly.move();
		sly.scratch();
		sly.sound();
		sop();
		
		Whale dory = new Whale("Whale", "DooOrRY", 20, "Female", "ocean", 25);
		sop(dory.toString());
		dory.eat();
		dory.swim();
		dory.sleep();
		dory.move();
		dory.sound();
		sop();
	}
	
}
