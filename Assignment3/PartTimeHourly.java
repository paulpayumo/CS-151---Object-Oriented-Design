public class PartTimeHourly extends Worker {
	private double hourlyPay;
	
	public PartTimeHourly() {}
	
	public PartTimeHourly(String first, String last)
	{
		super(first, last);
	}
	
	public PartTimeHourly(String first, String last, Address myAddy)
	{
		super(first, last, myAddy);
	}
	
	public double getPay()
	{
		return hourlyPay;
	}
	
	public void setPay(double pay)
	{
		this.hourlyPay = pay;
	}
	
	public String toString()
	{
		String myString = "I get paid $" + this.getPay() + " per hour.";
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
			sop("I get paid " + this.getPay() + " per hour");
		}
	}
	
	public double computePay(int hours)
	{
		if(hours > 40)
		{
			return -1;
		}else
			return hours*getPay();
	}
}
