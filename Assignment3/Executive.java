public class Executive extends FullTimeSalariedEmp{
	private double bonus;
	
	public Executive() {}
	
	public Executive(String first, String last)
	{
		super(first,last);
	}
	
	public Executive(String first, String last, Address myAddy)
	{
		super(first, last, myAddy);
	}
	
	public double getBonus()
	{
		return bonus;
	}
	
	public void setBonus(double bonus)
	{
		this.bonus = bonus;
	}
	
	public String toString()
	{
		String myString = "I get a bonus of $" + this.getBonus() + ".";
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
	
	public double computePay()
	{
		return getBonus() + getSalary();
	}
}
