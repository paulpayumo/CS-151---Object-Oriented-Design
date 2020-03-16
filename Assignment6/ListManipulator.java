import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Collections;

public class ListManipulator 
{
	public ListManipulator() {}
	
	private ArrayList<Integer>sort(ArrayList<Integer>myLst, Boolean ascending)
	{
		
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		if(ascending) {
			Collections.sort(myLst);
		}
		else {
			Collections.sort(myLst, Collections.reverseOrder());
		}
		sorted = myLst;
		return sorted;
	}
	
	private ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst)
	{
		ArrayList<Integer> swapped = new ArrayList<Integer>();
		Integer min;
		Integer max;
		min = myLst.indexOf(Collections.min(myLst));
		max = myLst.indexOf(Collections.max(myLst));
		Collections.swap(myLst, min, max);
		swapped = myLst;
		return swapped;
	}
	
	private void table(ArrayList<Integer> myLst)
	{
		int counter = 0;
		TreeSet<Integer> unique = new TreeSet<Integer>(myLst);
		ArrayList<Integer> sorted = new ArrayList<Integer>(unique);
		ArrayList<Integer> numberOfEach = new ArrayList<Integer>();
		for(int i = 0; i < sorted.size(); i++) {
			numberOfEach.add(0);
		}
		for(Integer i : myLst)
		{
			counter = numberOfEach.get((sorted.indexOf(i))) + 1;
			numberOfEach.set(sorted.indexOf(i), counter);
		}
		
		for(int i = 0; i < sorted.size(); i++)
		{
			System.out.printf("%-8d : %8d%n", sorted.get(i), numberOfEach.get(i));
		}
	}
	
	public static void sop(Object msg)
	{
		System.out.println(msg);
	}
	
	/*public static void main(String[] args)
	{
		ListManipulator checker = new ListManipulator();
		ArrayList<Integer> tester = new ArrayList<Integer>();
		tester.add(3);
		tester.add(2);
		tester.add(3);
		tester.add(1);
		tester.add(8);
		tester.add(5);
		tester.add(3);
		tester.add(7);
		tester.add(2);
		tester.add(8);
		tester.add(8);
		tester.add(2);
		tester.add(2);
		
		checker.table(tester);
		//tester = checker.sort(tester, false);
		//tester = checker.swapLargestSmallest(tester);
		for(Integer i: tester)
		{
			sop(i);
		}
	}*/
}
