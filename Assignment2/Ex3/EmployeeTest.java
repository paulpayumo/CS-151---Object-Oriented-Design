public class EmployeeTest 
{
	public static void main(String[] args)
	{
		Employee joe = new Employee("Joe", "Smith", 29, "212121", "215 S 12th St", "male", 210, "#123", "contractor", "Jan 15, 2018", 60);	
		joe.introduce();
		System.out.println("I should get paid " +joe.calculatePay(30) + " for 30 hours.\n");
		
		Employee lisa = new Employee("Lisa", "Gray", 19, "1234561", "9029 Gaines Ln", "female", 130, "#234", "full time", "Feb 2, 2015", 110000);
		lisa.introduce();
		System.out.println("I should get paid " +lisa.calculatePay(2) + " for 2 weeks.\n");
		
		Employee timothy = new Employee("Timothy", "Briggs", 22, "932194", "3183 Saks Ave", "male", 176, "#177", "full time", "March 30, 2008", 80000);
		timothy.introduce();
		System.out.println("I should get paid " + timothy.calculatePay(4) + " for 4 weeks.\n");
		
		Employee george = new Employee("George", "Wallace", 42, "74837112", "9113 San Francisco St", "male", 140, "#214", "part time", "July 3, 2010", 20);
		george.introduce();
		System.out.println("I should get paid " + george.calculatePay(25) + " for 25 weeks. \n");
		
		Employee amy = new Employee("Amy", "Student", 17, "358183", "375 San Fernando St", "female", 148, "#73", "contractor", "April 18, 2013", 45);
		amy.introduce();
		System.out.println("I shoudl get paid " + amy.calculatePay(45) +" for 45 hours. \n"); 
	}
}
