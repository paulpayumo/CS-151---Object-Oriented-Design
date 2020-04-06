import java.util.*;
import java.util.ArrayList;

public class Shapes extends Thread implements Runnable
{
	private double maxA = 0;
	private double minA = 99999999;
	private int maxIndex = 0;
	private int minIndex = 0;
	
	private ArrayList<Shapes> shapeList = new ArrayList<Shapes>();
	
	public void sop(Object msg)
	{
		System.out.println(msg);
	}
	
	public Shapes() {}
	
	public void add(Shapes shape)
	{
		shapeList.add(shape);
	}
	
	public void remove(int index)
	{
		shapeList.remove(index);
	}
	
	public void setShapeList(ArrayList<Shapes> shapeList)
	{
		this.shapeList = shapeList;
	}
	
	public ArrayList<Shapes> getShapeList()
	{
		return shapeList;
	}
	
	public double getMax()
	{
		return this.maxA;
	}
	
	public void setMax(double newMax)
	{
		this.maxA = newMax;
	}
	
	public double getMin()
	{
		return this.minA;
	}
	
	public void setMin(double newMin)
	{
		this.minA = newMin;
	}
	public double computeArea()
	{
		return 0;
	}
	
	public void run()
	{
		sop(this.computeArea());
	}
	
	public void max() {
		for(int i = 0; i < shapeList.size(); i++)
		{
			if(shapeList.get(i).computeArea() > this.getMax())
			{
				maxIndex = i;
				setMax(shapeList.get(i).computeArea());
			}
		}
		System.out.println(shapeList.get(maxIndex).toString());
	}
	
	public void min() {
		for(int i = 0; i < shapeList.size(); i++)
		{
			if(shapeList.get(i).computeArea() < this.getMin())
			{
				setMin(shapeList.get(i).computeArea());
				minIndex = i;
			}
		}
		System.out.println(shapeList.get(minIndex).toString());
	}
	public void compute()
	{
		synchronized(this) {
			for(int i = 0; i < shapeList.size(); i++)
			{
				Thread t = new Thread(shapeList.get(i));
				t.start();
			}
		}
	}
}
