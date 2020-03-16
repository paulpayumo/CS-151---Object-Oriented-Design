import java.util.Comparator;

public class TimeComp implements Comparator<Course>{
	
	@Override
	public int compare(Course first, Course second)
	{
		return first.getTime().compareTo(second.getTime());
	}
}
