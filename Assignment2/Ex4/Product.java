public final class Product {
	private final String productName;
	private final String prodDescrip;
	private final int price;
	private final int maxQuantity;
	
	public Product(String prodName, String prodDesc, int price, int maxQuantity)
	{
		productName = prodName;
		prodDescrip = prodDesc;
		this.price = price;
		this.maxQuantity = maxQuantity;
	}
	
	/*public void setName(String newName)
	{
		productName = newName;
	}*/
	public String getName()
	{
		return productName;
	}
	
	public String getProdDescription()
	{
		return prodDescrip;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public int getMaxQuantity()
	{
		return maxQuantity;
	}
	
	public String toString()
	{
		String myDescription = this.getName() + ". " + this.getProdDescription()+  ". My price is $" + this.getPrice() + ". You can purchase " + this.getMaxQuantity() + " at most.";
		return myDescription;
	}
}
