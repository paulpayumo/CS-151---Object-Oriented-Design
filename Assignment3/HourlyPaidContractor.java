public class HourlyPaidContractor extends PartTimeHourly{
	private double overtimePay;
	
	public HourlyPaidContractor() {}
	
	public HourlyPaidContractor(String first, String last)
	{
		super(first, last);
	}
	
	public HourlyPaidContractor(String first, String last, Address myAddy)
	{
		super(first, last, myAddy);
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
	public double computePay(int hours, int overtimeHrs)
	{
		return getPay()*hours + overtimeHrs*getOvertimePay();
	}
}
