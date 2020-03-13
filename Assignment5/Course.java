public class Course implements Cloneable
{
	private String name;
	private String description;
	private String time;
	private String day;
	
	public Course(String name, String description, String time, String day){
		this.name = name;
		this.description = description;
		this.time = time;
		this.day = day;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getDesc()
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
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setDesc(String desc)
	{
		this.description = desc;
	}
	
	public void setTime(String time)
	{
		this.time = time;
	}
	
	public void setDay(String day)
	{
		this.day = day;
	}
	
	public Object clone() throws CloneNotSupportedException{
		Course courses = (Course) super.clone();
		return courses;
	}
	
}
