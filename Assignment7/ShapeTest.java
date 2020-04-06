import java.io.*;

public class ShapeTest 
{
	public static void main(String[] args)
	{
		Shapes tester = new Shapes();
		
		Circle c1 = new Circle(1);
		Circle c2 = new Circle(.1);
		
		Triangle t1 = new Triangle(10, 10);
		Triangle t2 = new Triangle(1500000, 200000);
		
		Hexagon h1 = new Hexagon(2);
		Hexagon h2 = new Hexagon(3);
		
		Rectangle r1 = new Rectangle(4,9);
		Rectangle r2 = new Rectangle(2,3);
		
		try {
			FileOutputStream strOut1 = new FileOutputStream("./obj1.ser");
			FileOutputStream strOut2 = new FileOutputStream("./obj2.ser");
			FileOutputStream strOut3 = new FileOutputStream("./obj3.ser");
			FileOutputStream strOut4 = new FileOutputStream("./obj4.ser");
			FileOutputStream strOut5 = new FileOutputStream("./obj5.ser");
			FileOutputStream strOut6 = new FileOutputStream("./obj6.ser");
			FileOutputStream strOut7 = new FileOutputStream("./obj7.ser");
			FileOutputStream strOut8 = new FileOutputStream("./obj8.ser");
			ObjectOutputStream objOut1 = new ObjectOutputStream(strOut1);
			ObjectOutputStream objOut2 = new ObjectOutputStream(strOut2);
			ObjectOutputStream objOut3 = new ObjectOutputStream(strOut3);
			ObjectOutputStream objOut4 = new ObjectOutputStream(strOut4);
			ObjectOutputStream objOut5 = new ObjectOutputStream(strOut5);
			ObjectOutputStream objOut6 = new ObjectOutputStream(strOut6);
			ObjectOutputStream objOut7 = new ObjectOutputStream(strOut7);
			ObjectOutputStream objOut8 = new ObjectOutputStream(strOut8);
			objOut1.writeObject(c1);
			objOut2.writeObject(c2);
			objOut3.writeObject(t1);
			objOut4.writeObject(t2);
			objOut5.writeObject(h1);
			objOut6.writeObject(h2);
			objOut7.writeObject(r1);
			objOut8.writeObject(r2);
			objOut7.close();
			objOut6.close();
			objOut5.close();
			objOut4.close();
			objOut3.close();
			objOut2.close();
			objOut1.close();
			strOut8.close();
			strOut7.close();
			strOut6.close();
			strOut5.close();
			strOut4.close();
			strOut3.close();
			strOut2.close();
			strOut1.close();
		}catch (IOException e) {
			System.out.println(e);
		}
		
		tester.add(t2);
		tester.add(c2);
		tester.add(c1);
		tester.add(t1);
		tester.add(h1);
		tester.add(h2);
		tester.add(r1);
		tester.add(r2);
		
		
		tester.max();
		tester.min();
		
		tester.compute();
		
		
	}
}
