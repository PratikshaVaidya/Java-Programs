package Collection;

import java.util.*;


public class VectorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new Vector();
		l.add(12);
		l.add("sweety");
		l.add('S');
		l.add(124.1f);
		l.add(17.33);
		l.add(null);
		System.out.println(l);
		System.out.println(l.get(4));
		System.out.println(l.set(0, 4));
		System.out.println(l);
		
		Object o[]=l.toArray();
		for(Object i:o)
		{
			System.out.println(i);
		}
		System.out.println(l.indexOf(4));
		System.out.println(l.lastIndexOf(10));
		l.remove(null);
		System.out.println(l);
		
		List l1=l.subList(1, 4);
		System.out.println(l1);
		l1.clear();
		System.out.println(l1);
		System.out.println(l1.isEmpty());
	}

}
