import java.io.Serializable;

public class Circle extends Shapes implements Serializable
{
	final double pi = Math.PI;
	
	private double Radius;
	
	public Circle(double Radius)
	{
		this.Radius = Radius;
	}
	
	public void setRadius(double Radius)
	{
		this.Radius = Radius;
	}
	
	
	public double getRadius()
	{
		return this.Radius;
	}
	
	
	public String toString()
	{
		return "Circle. Radius: " + Double.toString(Radius);
	}
	
	public double computeArea()
	{
		double area = pi*getRadius()*getRadius();
		return area;
	}
	public void run()
	{
		sop(this.computeArea());
	}
}
