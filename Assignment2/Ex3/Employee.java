public class Employee extends Person {
	private String id;
	private String status; 
	private String start;
	private int pay;
	
	public Employee(String first, String last, int age, String soc, String addy, 
			String gender, double weight, String id, String status, String start, int pay)
	{
		super(first, last, age, soc, addy, gender, weight);
		this.id = id;
		this.status = status;
		this.start = start;
		this.pay = pay;
	}
	
	public void setID(String newID)
	{
		id = newID;
	}
	
	public void setStatus(String newStatus)
	{
		status = newStatus;
	}
	
	public void setStart(String newStart)
	{
		start = newStart;
	}
	
	public void setPay(int pay)
	{
		this.pay = pay;
	}
	
	public String getID()
	{
		return id;
	}
	
	public String getStatus()
	{
		return status;
	}
	
	public String getStart()
	{
		return start;
	}
	
	public int getPay()
	{
		return pay;
	}
	
	public void introduce()
	{
		super.introduce();
		if(this.getStatus().equalsIgnoreCase("full time"))
		{
			System.out.printf(" In addition I am a %s. I started working %s and get paid $%d per year.", this.getStatus(), this.getStart(), this.getPay());
		}else {
			System.out.printf(" In addition I am a %s. I started working %s and get paid %d per hour.", this.getStatus(), this.getStart(), this.getPay());
		}
	}
	
	public double calculatePay(double hoursOrWeeks)
	{
		double myPay;
		if(this.getStatus().equalsIgnoreCase("full time"))
		{
			myPay = this.getPay() / 52 * hoursOrWeeks;
		}else
		{
			myPay = this.getPay() * hoursOrWeeks;
		}
		return myPay;
	}
}

