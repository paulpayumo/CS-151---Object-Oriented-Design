public class Address 
{
	private String streetNum;
	private String streetName;
	private String city;
	private String zip;
	private String state;
	
	public Address()
	{
	}
	public Address(String streetNum, String streetName, String city, String zip, String state)
	{
		this.streetNum = streetNum;
		this.streetName = streetName;
		this.city = city;
		this.zip = zip;
		this.state = state;
	}
	
	//insert setter and getters
	public void setStreetNum(String newStreetNum)
	{
		this.streetNum= newStreetNum;
	}
	
	public void setStreetName(String newStreetName)
	{
		this.streetName = newStreetName;
	}
	
	public void setCity(String newCity)
	{
		this.city = newCity;
	}
	
	public void setZip(String zip)
	{
		this.zip = zip;
	}
	
	public void setState(String state)
	{
		this.state = state;
	}
	
	public String getStreetNum()
	{
		return streetNum;
	}
	
	public String getStreetName()
	{
		return streetName;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public String getZip()
	{
		return zip;
	}
	
	public String getState()
	{
		return state;
	}
	public String getFullAddy()
	{
		return this.getStreetNum()+ " " + this.getStreetName() + " " +  this.getCity() + " "  + this.getState() + " " + this.getZip();
	}
}
