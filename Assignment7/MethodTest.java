import java.util.*;

public class MethodTest {
	private static<T> void count(ArrayList<T> input) 
	{
		System.out.println(input.size());
	}
	
	public static void main(String[] args) {
		ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e"));
		ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		ArrayList<Double> dblList = new ArrayList<Double>(Arrays.asList(1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8));
		
		count(stringList);
		count(intList);
		count(dblList);
	}
}
