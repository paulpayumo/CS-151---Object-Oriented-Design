import java.io.Serializable;

public class Triangle extends Shapes implements Serializable
{
	private double base;
	private double height;
	
	public Triangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}
	
	public void setbase(double base)
	{
		this.base = base;
	}
	
	public void setheight(double height)
	{
		this.height = height;
	}
	
	public double getbase()
	{
		return this.base;
	}
	
	public double getheight()
	{
		return this.height;
	}
	
	public String toString()
	{
		return "Triangle. Base: " + Double.toString(base) + ". height: " + Double.toString(height);
	}
	
	public double computeArea()
	{
		double area = getbase()*getheight()*.5;
		return area;
	}
	
	public void run()
	{
		sop(this.computeArea());
	}
}
