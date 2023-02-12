package MapPrograms;
import java.util.*;
public class HashMapProgram 
{

	public static void main(String[] args) 
	{
		Map m=new HashMap();
		m.put(1, "hello");
		m.put(119.99, "sweety");
		m.put('P', 'A');
		m.put(12.2f, null);
		m.put(null, 11);
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.isEmpty());
		System.out.println(m.get(null));
		System.out.println(m.containsKey(12.2f));
		System.out.println(m.containsValue(11));
		m.remove('P');
		System.out.println(m);
		
		Map m1=new HashMap();
		m1.put(14, 5);
		m1.put("ABC", 5);
		m1.put(2.5f, 3.14);
		System.out.println(m1);
		m.putAll(m1);
		System.out.println(m);
		System.out.println(m1.isEmpty());
	}

}