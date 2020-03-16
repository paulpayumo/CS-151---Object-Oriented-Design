import java.util.Collections;
import java.util.LinkedList;

public class Student {
	private String first;
	private String last;
	private int age;
	private double gpa;
	private String dpt;
	private LinkedList<Course> courses = new LinkedList<Course>();
	
	public Student() {}
	
	private void setFirst(String first)
	{
		this.first = first;
	}
	
	private void setLast(String last)
	{
		this.last = last;
	}
	
	private void setAge(int age)
	{
		this.age = age;
	}
	
	private void setGPA(double gpa)
	{
		this.gpa = gpa;
	}
	
	private void setDpt(String dpt)
	{
		this.dpt = dpt;
	}
	
	private void setCourses(LinkedList<Course> courses)
	{
		this.courses = courses;
	}
	
	private String getFirst()
	{
		return this.first;
	}
	
	private String getLast()
	{
		return this.last;
	}
	
	private int getAge()
	{
		return this.age;
	}
	
	private double getGPA()
	{
		return this.gpa;
	}
	
	private String getDpt()
	{
		return this.dpt;
	}
	
	public LinkedList<Course> getCourse()
	{
		return this.courses;
	}
	
	public void addCourse(Course course)
	{
		courses.add(course);
	}
	
	public void removeCourse()
	{
		courses.remove();
	}
	
	public void removeCourse(int index)
	{
		courses.remove(index);
	}
	
	public void removeCourse(String name)
	{
		int index = 0;
		int removedIndex = 0;
		for(Course checker : courses)
		{	
			
			if(checker.getName().equals(name))
			{
				removedIndex = index;
			}
			index++;
		}
		courses.remove(removedIndex);
	}
	
	public void sortCourses(String param, boolean ascending)
	{
		if(param.toLowerCase().equals("name") && ascending)
			Collections.sort(this.courses, new NameComp());
		else if(param.toLowerCase().equals("name") && !ascending)
		{
			Collections.sort(this.courses, new NameComp());
			LinkedList<Course> newList = new LinkedList<Course>();
			for(Course first: courses)
			{
				newList.addFirst(first);
			}
			courses = newList;
		}
		else if(param.toLowerCase().equals("description") && ascending)
			Collections.sort(this.courses, new DescComp());
		else if(param.toLowerCase().equals("description") && !ascending)
		{
			Collections.sort(this.courses, new DescComp());
			LinkedList<Course> newList = new LinkedList<Course>();
			for(Course first: courses)
			{
				newList.addFirst(first);
			}
			courses = newList;
		}
		else if(param.toLowerCase().equals("time") && ascending)
			Collections.sort(this.courses, new TimeComp());
		else if(param.toLowerCase().equals("time") && !ascending)
		{
			Collections.sort(this.courses, new TimeComp());
			LinkedList<Course> newList = new LinkedList<Course>();
			for(Course first: courses)
			{
				newList.addFirst(first);
			}
			courses = newList;
		}
		else if(param.toLowerCase().equals("day") && ascending)
			Collections.sort(this.courses, new DayComp());
		else if(param.toLowerCase().equals("day") && !ascending)
		{
			Collections.sort(this.courses, new DayComp());
			LinkedList<Course> newList = new LinkedList<Course>();
			for(Course first: courses)
			{
				newList.addFirst(first);
			}
			courses = newList;
		}
		
		else System.out.println("Please input any of the following:%n Name %n Description %n Time %n Day");
	}
	
	public static void main(String[] args)
	{
		Student john = new Student();
		Course course1 = new Course();
		Course course2 = new Course();
		Course course3 = new Course();
		Course course4 = new Course();
		
		course1.setName("EE151");
		course2.setName("CS141");
		course3.setName("EE122");
		course4.setName("CS147");
		
		course1.setDay("Monday");
		course2.setDay("Tuesday");
		course3.setDay("Wednesday");
		course4.setDay("Sunday");
		
		course1.setTime("6:00 PM");
		course2.setTime("1:30 PM");
		course3.setTime("4:30 PM");
		course4.setTime("10:00 AM");
		
		course1.setDescription("Electrical Engineering 1");
		course2.setDescription("Computer Science 14");
		course3.setDescription("Electrical Engineering 3");
		course4.setDescription("Computer Science 0");
		
		john.addCourse(course1);
		john.addCourse(course2);
		john.addCourse(course3);
		john.addCourse(course4);
		
		john.sortCourses("description", false);
		
		for(Course first: john.getCourse())
		{
			System.out.println(first.getDescription());
		}
	}
}
