package Collection;

import java.util.*;


public class LinkedHashSetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s=new LinkedHashSet();
		s.add(10);
		s.add("sweety");
		s.add('P');
		s.add(22);
		s.add(56.45);
		s.add(11.1f);
		s.add(null);
		System.out.println(s);
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		System.out.println(s.contains(2));
		System.out.println(s);
		
		/*Object o[]=s.toArray();
		for(Object i:s)
		{
			System.out.println(s);
		}*/
		s.remove(null);
		System.out.println(s);
		s.clear();
		System.out.println(s);
		System.out.println(s.isEmpty());

	}

}
