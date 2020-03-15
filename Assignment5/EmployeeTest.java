public class EmployeeTest 
{
	public static void main(String[] args)
	{
		Employee john = new Employee();
		john.setFirst("John");
		john.setLast("Smith");
		john.setID("101");
		john.setHourly(35);
		
		try {
			System.out.println(john.computePay(40));
		}catch(NumberFormatException e)
		{
			System.out.println(e);
		}catch(TooManyHoursWorkedException e)
		{
			System.out.println(e);
		}
		
		try {
			System.out.println(john.computePay(23));
		}catch(NumberFormatException e)
		{
			System.out.println(e);
		}catch(TooManyHoursWorkedException e)
		{
			System.out.println(e);
		}
		
		try {
			System.out.println(john.computePay(1));
		}catch(NumberFormatException e)
		{
			System.out.println(e);
		}catch(TooManyHoursWorkedException e)
		{
			System.out.println(e);
		}
		
		try {
			System.out.println(john.computePay(0));
		}catch(NumberFormatException e)
		{
			System.out.println(e);
		}catch(TooManyHoursWorkedException e)
		{
			System.out.println(e);
		}
		
		try {
			System.out.println(john.computePay(-5));
		}catch(NumberFormatException e)
		{
			System.out.println(e);
		}catch(TooManyHoursWorkedException e)
		{
			System.out.println(e);
		}
		
		try {
			System.out.println(john.computePay(45));
		}catch(NumberFormatException e)
		{
			System.out.println(e);
		}catch(TooManyHoursWorkedException e)
		{
			System.out.println(e);
		}
	}
}
