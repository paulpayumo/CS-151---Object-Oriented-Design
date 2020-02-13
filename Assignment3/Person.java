public class Person 
{
	private String firstName;
	private String lastName;
	private int age;
	private String socSecNum;
	private String levelOfEducation;
	private String idNum;
	private Address myAddress;
	
	public void sop(Object msg)
	{
		System.out.println(msg);
	}
	
	public Person(String first, String last)
	{
		this.firstName = first;
		this.lastName = last;
	}
	
	
	public Person(String first, String last, Address myAddy)
	{
		this.firstName = first;
		this.lastName = last;
		this.myAddress = myAddy;
	}
	
	public Person()
	{
	}
	
	public String toString()
	{
		String myString;
		myString = "My name is " + this.getFirst() + " " + this.getLast() + ". I live at " + this.myAddress.getFullAddy() + ". I am " + this.getAge() + ". My level of education is: " + this.getLevelOfEd() + ".";
		return myString;
	}
	
	public void introduce()
	{
		sop(toString());
	}
	
	public void introduce(String socFlag)
	{
		sop(this.toString());
		if(socFlag.toLowerCase().equals("yes"))
		{
			sop("My social security number is " + this.getSocSecNum() + ".");
		}
	}
	
	public void setAddy(Address newAddy)
	{
		this.myAddress = newAddy;
	}
	
	public Address getAddress()
	{
		return myAddress;
	}
	
	public void setFirst(String newFirst)
	{
		this.firstName = newFirst;
	}
	
	public String getFirst()
	{
		return firstName;
	}
	
	public void setLast(String newLast)
	{
		this.lastName = newLast;
	}
	
	public String getLast()
	{
		return lastName;
	}
	
	public void setAge(int newAge)
	{
		age = newAge;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setSocSecNum(String newSoc)
	{
		socSecNum = newSoc;
	}
	
	public String getSocSecNum()
	{
		return socSecNum;
	}
	
	public void setLevelOfEd(String newLevel)
	{
		this.levelOfEducation = newLevel;
	}
	
	public String getLevelOfEd()
	{
		return levelOfEducation;
	}
	
	public void setId(String newId)
	{
		this.idNum = newId;
	}
	
	public String getId()
	{
		return this.idNum;
	}
}
