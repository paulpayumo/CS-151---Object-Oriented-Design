public class Student
{
  private String firstName;
  private String lastName;
  private int age;
  private double gpa;
  private String major;
  private String department;
  
  public static void sop(Object msg)
  {
    System.out.println(msg);
  }
  
  public Student(String first, String last, int age, double gpa, String major, String dpt)
  {
    firstName = first;
    lastName = last;
    age = this.age;
    gpa = this.gpa;
    major = this.major;
    department = dpt;
  }
  
  public void setFirst(String newFirst)
  {
    firstName = newFirst;
  }
  
  public void setLast(String newLast)
  {
    lastName = newLast;
  }
  
  public void setAge(int age)
  {
    age = this.age;
  }
  
  public void setGPA(double gpa)
  {
    gpa = this.gpa;
  }
  
  public void setMajor(String newMajor)
  {
    major = newMajor;
  }
  
  public void setDepartment(String newDpt)
  {
    department = newDpt;
  }
  
  public String getFirst()
  {
    return firstName;
  }
  
  public String getLast()
  {
    return lastName;
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
    return department;
  }
  
  class Course
  {
    public void printSchedule()
    {
      sop("MoWe: 8:30AM - 9:45AM, 10:00AM - 11:45 AM");
      sop("TuTh: 1:30PM - 2:45PM, 3:00PM - 5:45 PM");
    }
  }
  
  public void printSchedule()
  {
	  Course schedulePrinter = new Course();
	  schedulePrinter.printSchedule();
  }
}
