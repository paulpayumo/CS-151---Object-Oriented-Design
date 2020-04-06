import java.io.Serializable;

public class Rectangle extends Shapes implements Serializable
{
	private double length;
	private double width;
	
	public Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	
	public void setlength(double length)
	{
		this.length = length;
	}
	
	public void setwidth(double width)
	{
		this.width = width;
	}
	
	public double getlength()
	{
		return this.length;
	}
	
	public double getwidth()
	{
		return this.width;
	}
	
	public String toString()
	{
		return "Rectangle. Length: " + Double.toString(length) + ". width: " + Double.toString(width);
	}
	
	public double computeArea()
	{
		double area = getlength()*getwidth();
		return area;
	}
	
	public void run()
	{
		sop(this.computeArea());
	}
}
