import java.io.Serializable;

public class Hexagon extends Shapes implements Serializable
{
	final double constant = 2.59807621135;
	
	private double Side;
	
	public Hexagon(double Side)
	{
		this.Side = Side;
	}
	
	public void setSide(double Side)
	{
		this.Side = Side;
	}
	
	
	public double getSide()
	{
		return this.Side;
	}
	
	
	public String toString()
	{
		return "Hexagon. Side: " + Double.toString(Side);
	}
	
	public double computeArea()
	{
		double area = constant*getSide()*getSide();
		return area;
	}
	
	public void run()
	{
		sop(this.computeArea());
	}
}
