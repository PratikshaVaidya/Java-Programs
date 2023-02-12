package Collection;
import java.util.*;
class Student12
{
	int res;
	String name;
	
	public Student12(int res, String name) {
		super();
		this.res = res;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student12 [res=" + res + ", name=" + name + "]";
	}
	
	
	
}
public class ComparatorExample implements Comparator<Student12>
{

	public static void main(String[] args) 
	{
		
		ComparatorExample ce=new ComparatorExample();
		List<Student12>l=new ArrayList<Student12>();
		l.add(new Student12(75,"Ram"));
		l.add(new Student12(85,"Rama"));
		l.add(new Student12(50,"Ramesh"));
		l.add(new Student12(86,"Raj"));
		l.add(new Student12(45,"Radha"));
		
		Collections.sort(l,ce);
		
		ListIterator<Student12>li=l.listIterator();		
		while(li.hasNext())
		{
			Student12 s=li.next();
			System.out.println(s);
		}
	}

	@Override
	public int compare(Student12 s1, Student12 s2)
	{
		return s1.res-s2.res;
	}
	}

