import java.util.ArrayList;
import java.util.Collections;

public class PersonTest {
	
	public static void sop(Object msg)
	{
		System.out.println(msg);
	}
	public static void main(String[] args)
	{
		Person joe = new Person();
		joe.setFirst("Joe");
		joe.setLast("Smith");
		joe.setAge(40);
		
		Person amy = new Person();
		amy.setFirst("Amy");
		amy.setLast("Gold");
		amy.setAge(32);
		
		Person tony = new Person();
		tony.setFirst("Tony");
		tony.setLast("Stork");
		tony.setAge(21);
		
		Person sean = new Person();
		sean.setFirst("Sean");
		sean.setLast("Irish");
		sean.setAge(24);
		
		Person tina = new Person();
		tina.setFirst("Tina");
		tina.setLast("Brock");
		tina.setAge(28);
		
		Person lenny = new Person();
		lenny.setFirst("Lenny");
		lenny.setLast("Hep");
		lenny.setAge(18);
		
		ArrayList<Person> unsorted = new ArrayList<Person>();
		unsorted.add(joe);
		unsorted.add(amy);
		unsorted.add(tony);
		unsorted.add(sean);
		unsorted.add(tina);
		unsorted.add(lenny);
		
		Collections.sort(unsorted, Person.FirstComp);
		for(Person check : unsorted)
		{
			sop(check.getFirst());
		}
		sop("");
		
		Collections.reverse(unsorted);
		for(Person check : unsorted)
		{
			sop(check.getFirst());
		}
		sop("");
		
		Collections.sort(unsorted, Person.LastComp);
		for(Person check : unsorted)
		{
			sop(check.getLast());
		}
		sop("");
		
		Collections.reverse(unsorted);
		for(Person check : unsorted)
		{
			sop(check.getLast());
		}
		sop("");
		
		Collections.sort(unsorted, Person.AgeComp);
		for(Person check : unsorted)
		{
			sop(check.getAge());
		}
		sop("");
		
		Collections.reverse(unsorted);
		for(Person check : unsorted)
		{
			sop(check.getAge());
		}
		sop("");
	}
}
