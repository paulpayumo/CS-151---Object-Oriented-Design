import java.util.Comparator;

public class DescComp implements Comparator<Course>{
	
	@Override
	public int compare(Course first, Course second)
	{
		return first.getDescription().compareTo(second.getDescription());
	}
}
