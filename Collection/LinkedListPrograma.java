package Collection;


import java.util.*;

public class LinkedListPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new LinkedList();
		l.add(123);
		l.add("pratiksha");
		l.add('S');
		l.add(12.1f);
		l.add(12.33);
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
		System.out.println(l.indexOf(6));
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
