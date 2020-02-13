public class FullTimeHourlyEmp extends PartTimeHourly{
	private double overtimePay;
	
	public FullTimeHourlyEmp() {}
	
	public FullTimeHourlyEmp(String first, String last)
	{
		super(first,last);
	}
	
	public FullTimeHourlyEmp(String first, String last, Address myAddy)
	{
		super(first,last,myAddy);
	}
	
	public double getOvertimePay()
	{
		return overtimePay;
	}
	
	public void setOvertimePay(double newPay)
	{
		overtimePay = newPay;
	}
	
	public String toString()
	{
		String myString = "I get paid this much during overtime $" + this.getOvertimePay() + ".";
		return myString;
	}
	
	public void introduce()
	{
		super.introduce();
		sop(super.toString());
	}
	
	public void introduce(String socFlag, String payFlag)
	{
		super.introduce(socFlag, payFlag);
		sop(this.toString());
	}
	
	public double computePay(int hours, int overtimeHours)
	{
		return hours*getPay() + overtimeHours*getOvertimePay();
	}
}
