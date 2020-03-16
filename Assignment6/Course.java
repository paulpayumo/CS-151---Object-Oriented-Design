public class Course {
	private String name;
	private String description;
	private String time;
	private String day;
	
	public Course() {}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public void setTime(String time)
	{
		this.time = time;
	}
	
	public void setDay(String day)
	{
		this.day = day;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
	public String getTime()
	{
		return this.time;
	}
	
	public String getDay()
	{
		return this.day;
	}
}
