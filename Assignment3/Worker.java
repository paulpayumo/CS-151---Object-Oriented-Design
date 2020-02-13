public class Worker extends Person{
	private String directDeposit;
	private String accomodations;
	
	public Worker() {}
	public Worker(String first, String last, Address myAddy)
	{
		super(first, last, myAddy);
	}
	public Worker(String first, String last)
	{
		super(first, last);
	}
	
	public String getDeposit()
	{
		return directDeposit;
	}
	
	public String getAccomodations()
	{
		return accomodations;
	}
	
	public void setDeposit(String newDeposit)
	{
		directDeposit = newDeposit;
	}
	
	public void setAccomodations(String newAccomodations)
	{
		accomodations = newAccomodations;
	}
	
	public String toString()
	{
		String myString = "My direct deposit preference is: " + this.getDeposit() + ". Accomodations: " +this.getAccomodations() + ".";
		return myString;
	}
	
	public void introduce()
	{
		sop(super.toString());
	}
	
	public void introduce(String socFlag)
	{
		super.introduce(socFlag);
		sop(this.toString());
	}
}
