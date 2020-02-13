public class FullTimeSalariedEmp extends Worker{
	private double salary;
	
	public FullTimeSalariedEmp() {}
	
	public FullTimeSalariedEmp(String first, String last)
	{
		super(first, last);
	}
	
	public FullTimeSalariedEmp(String first, String last, Address myAddy)
	{
		super(first,last, myAddy);
	}
	
	public double getSalary()
	{
		return this.salary;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public String toString()
	{
		String myString = "I get paid $" + this.getSalary() + ".";
		return myString;
	}
	
	public void introduce()
	{
		super.introduce();
		sop("My social security number is " + this.getSocSecNum() + ".");
		sop(super.toString());
		sop(this.toString());
	}
	
	public void introduce(String socFlag, String payFlag)
	{
		super.introduce();
		sop(super.toString());
		if(socFlag.toLowerCase().equals("yes"))
			sop("My social security number is " + this.getSocSecNum() + ".");
		if(payFlag.toLowerCase().equals("yes"))
		{
			sop("I get paid " + this.getSalary() + " per year");
		}
	}
	
	public double computePay(double weeks)
	{
		double perYear = weeks/52;
		return perYear*this.getSalary();
	}
}
