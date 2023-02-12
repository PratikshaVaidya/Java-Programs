package Collection;
import java.util.*;

class Student111 implements Comparable<Student111>
{
    int res;
    String name;
    
	public Student111(int res, String name) {
		super();
		this.res = res;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Student111 [res=" + res + ", name=" + name + "]";
		
	}


	public int compareTo(Student111 s1)
	{
		return s1.res-this.res;
	}


	


	
	
}
public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student111>l=new ArrayList<Student111>();
		l.add(new Student111(75,"Ram"));
		l.add(new Student111(85,"Rama"));
		l.add(new Student111(50,"Ramesh"));
		l.add(new Student111(86,"Raj"));
		l.add(new Student111(45,"Radha"));
		
		Collections.sort(l);
		ListIterator<Student111>li=l.listIterator();
		while(li.hasNext())
		{
			Student111 s=li.next();
			System.out.println(s);
		}
	}

}
