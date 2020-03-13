public class StudentTest
{
	public static void main(String[] args)
	{
		Student john = new Student();
		john.setFirst("John");
		john.setLast("Smith");
		john.setAge(20);
		john.setGPA(3.6);
		john.setMajor("Computer Science");
		john.setDpt("School of Computer Science");
		
		try {
			Student john2 = (Student) john.clone();
			john2.setAge(21);
			john2.setLast("Williams");
			john.printInfo();
			john2.printInfo();
		}catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}
}
