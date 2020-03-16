import java.util.Comparator;

public class NameComp implements Comparator<Course> {
	
	@Override
	public int compare(Course first, Course second)
	{
		return first.getName().compareTo(second.getName());
	}
}
