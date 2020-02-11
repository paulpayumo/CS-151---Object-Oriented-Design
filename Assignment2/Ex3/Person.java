public class Person {
	private String first;
	private String last;
	private Integer age;
	private String socSecNum;
	private String address;
	private String gender;
	private double weight;
	
	public void sop(Object msg)
	{
		System.out.println(msg);
	}
	
	public Person(String first, String last, int age, String soc, String address, String gender, double weight)
	{
		this.first = first;
		this.last = last;
		this.age = age;
		socSecNum = soc;
		this.address = address;
		this.gender = gender;
		this.weight = weight;
	}
	
	public void setFirst(String newFirst)
	{
		first = newFirst;
	}
	
	public void setLast(String newName)
	{
		last = newName;
	}
	
	public void setAge(int newAge)
	{
		age = newAge;
	}
	
	public void setSocNum(String newSoc)
	{
		socSecNum = newSoc;
	}
	
	public void setAddress(String newAddy)
	{
		address = newAddy;
	}
	
	public void setGender(String newGend)
	{
		gender = newGend;
	}
	
	public void setWeight(double newWeight)
	{
		weight = newWeight;
	}
	
	public String getFirst()
	{
		return first;
	}
	
	public String getLast()
	{
		return last;
	}
	
	public Integer getAge()
	{
		return age;
	}
	
	public String getSoc()
	{
		return socSecNum;
	}
	
	public String getAddy()
	{
		return address;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public String toString() 
	{
		return this.getFirst() + " " + this.getLast() + ", " + this.getAge().toString() + ", don't worry about my Social Security #. It's Private."
				+ " I live at " + this.getAddy() + ". I am a " + this.getGender() + " and I weigh " + this.getWeight() + ".";
	}
	
	public void introduce()
	{
		sop(this.toString());
	}
}

