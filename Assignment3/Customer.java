public class Customer extends Person
{
	private String prefMethodOfPayment;
	
	public Customer() {}
	public Customer(String first, String last)
	{
		super(first, last);
	}
	public Customer(String first, String last, Address myAddy)
	{
		super(first,last, myAddy);
	}
	
	
	public String getMethodOfPay()
	{
		return prefMethodOfPayment;
	}
	
	public void setMethodOfPay(String newPaymentPlan)
	{
		this.prefMethodOfPayment = newPaymentPlan;
	}

	
	public void makePayment()
	{
		System.out.println(this.getMethodOfPay());
	}

	public String toString()
	{
		String myString;
		myString = "My customer number is " + this.getId() + " and my preferred payment method is " + this.getMethodOfPay() +".";
		return myString;
	}
	
	public void introduce()
	{
		sop(super.toString());
		sop(this.toString());
	}
	
	public void introduce(String socFlag)
	{
		sop(super.toString());
		if(socFlag.toLowerCase().equals("yes"))
			sop("My social security number is " + this.getSocSecNum() + ".");
		sop(this.toString());
	}
