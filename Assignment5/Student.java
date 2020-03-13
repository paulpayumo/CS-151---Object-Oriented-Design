public class Student implements Cloneable
{
	private Course cs151 = new Course("CS151", "Object Oriented Desgin", "6:00 PM", "Tuesdays");
	private Course ee120 = new Course("EE120", "Microprocessor System Design", "9:00 AM", "Thursdays");
	private Course ee122 = new Course("EE122", "Electronic Design I", "1:30 PM", "Wednesdays");
	private Course ee132 = new Course("EE132", "Theory of Automatic Controls", "4:30 PM", "Mondays");
	private String first;
	private String last;
	private int age;
	private double gpa;
	private String major;
	private String dpt;
	
	public Student(){}
	
	public Course getCourse1()
	{
		return cs151;
	}
	
	public Course getCourse2()
	{
		return ee120;
	}
	
	public Course getCourse3()
	{
		return ee122;
	}
	
	public Course getCourse4()
	{
		return ee132;
	}
	
	public String getFirst()
	{
		return first;
	}
	
	public String getLast()
	{
		return last;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public double getGPA()
	{
		return gpa;
	}
	
	public String getMajor()
	{
		return major;
	}
	
	public String getDpt()
	{
		return dpt;
	}
	
	public void setCourse1(Course course)
	{
		cs151 = course;
	}
	
	public void setCourse2(Course course)
	{
		ee120 = course;
	}
	
	public void setCourse3(Course course)
	{
		ee122 = course;
	}
	
	public void setCourse4(Course course)
	{
		ee132 = course;
	}
	
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
	
	public void setGPA(double gpa)
	{
		this.gpa = gpa;
	}
	
	public void setMajor(String major)
	{
		this.major = major;
	}
	
	public void setDpt(String dpt)
	{
		this.dpt = dpt;
	}
	
	@Override
	public String toString()
	{
		String myString = "";
		myString = "My name is " + this.getFirst() + " " + this.getLast() + ". I am " + this.getAge() + " years old. I am a " + this.getMajor() + " major in the " + this.getDpt() + ". I am taking the following Courses: ";
		return myString;
	}
	
	public void Clone()
	{
		
	}
	public void printInfo()
	{
		System.out.println(this.toString());
		System.out.println(this.cs151.getName() + ": " + this.cs151.getDesc() + " " + this.cs151.getTime() + " " + this.cs151.getDay());
		System.out.println(this.ee122.getName() + ": " + this.ee122.getDesc() + " " + this.ee122.getTime() + " " + this.ee122.getDay());
		System.out.println(this.ee120.getName() + ": " + this.ee120.getDesc() + " " + this.ee120.getTime() + " " + this.ee120.getDay());
		System.out.println(this.ee132.getName() + ": " + this.ee132.getDesc() + " " + this.ee132.getTime() + " " + this.ee132.getDay());
	}
	
	protected Object clone() throws CloneNotSupportedException{
		Student newStud = (Student) super.clone();
		newStud.cs151 = (Course) cs151.clone();
		newStud.ee122 = (Course) ee122.clone();
		newStud.ee120 = (Course) ee120.clone();
		newStud.ee132 = (Course) ee132.clone();
		return newStud;
	}
}
