package Collection;

import java.util.*;
public class NavigableSetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableSet s=new TreeSet();
		s.add(70);
		s.add(23);
		s.add(45);
		s.add(2);
		s.add(1);
		System.out.println(s);
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.floor(50));
		System.out.println(s.ceiling(50));
		

	}

}
