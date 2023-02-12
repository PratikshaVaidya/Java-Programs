package Generics;

import java.util.*;
public class SetWithGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Float>s=new HashSet<Float>();
		s.add(10.2f);
		s.add(2.3F);
		s.add(3.4f);
		s.add(4.5f);
		s.add(5.6f);
		System.out.println(s);
		Iterator<Float>i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
