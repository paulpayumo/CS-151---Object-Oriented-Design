public class Employee 
{
	private String first;
	private String last;
	private String ID;
	private double hourlyPay;
	
	public Employee(){}
	
	public void setFirst(String first)
	{
		this.first = first;
	}
	
	public void setLast(String last)
	{
		this.last = last;
	}
	
	public void setID(String ID)
	{
		this.ID = ID;
	}
	
	public void setHourly(int pay)
	{
		this.hourlyPay = pay;
	}
	
	public String getFirst()
	{
		return first;
	}
	
	public String getLast()
	{
		return last;
	}

	public String getID()
	{
		return ID;
	}
	
	public double getPay()
	{
		return this.hourlyPay;
	}
	
	public double computePay(int hours) throws NumberFormatException, TooManyHoursWorkedException
	{
		String neg = "Please input a positive number of hours.";
		String many = "Please input between 0 and 40 hours";
		double totalPay;
		if(hours < 0)
			throw new NumberFormatException(neg);
		if(hours > 40)
			throw new TooManyHoursWorkedException(many);
		totalPay = hours*this.getPay();
		return totalPay;
		
	}
}

