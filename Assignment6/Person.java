import java.util.Comparator;

public class Person implements Comparable<Person>
{
	private String first;
	private String last;
	private int age;
	
	public Person() {}
	
	public void setFirst(String first)
	{
		this.first = first;
	}
	
	public void setLast(String last)
	{
		this.last = last;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getFirst()
	{
		return this.first;
	}
	
	public String getLast()
	{
		return this.last;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public static final Comparator<Person> FirstComp = new Comparator<Person>() 
	{
		public int compare(Person first, Person second)
		{
			return first.getFirst().compareTo(second.getFirst());
		}
	};
	
	public static final Comparator<Person> LastComp = new Comparator<Person>() 
	{
		public int compare(Person first, Person second)
		{
			return first.getLast().length() - second.getLast().length();
		}
	};
	
	public static final Comparator<Person> AgeComp = new Comparator<Person>() 
	{
		public int compare(Person first, Person second)
		{
			return first.getAge() - second.getAge();
		}
	};

	@Override
	public int compareTo(Person o) {
		return this.age - o.age;
	}
}


