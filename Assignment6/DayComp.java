import java.util.Comparator;

public class DayComp implements Comparator<Course>{
	
	@Override
	public int compare(Course first, Course second)
	{
		return first.getDay().compareTo(second.getDay());
	}
}
