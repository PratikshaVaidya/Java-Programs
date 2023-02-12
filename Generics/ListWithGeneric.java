package Generics;
import java.util.*;
public class ListWithGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>l=new ArrayList<String>();
		l.add("Pune");
		l.add("Nashik");
		l.add("Nagpur");
		l.add("Mumbai");
		l.add("Goa");
		System.out.println(l);
		ListIterator<String>li=l.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("*****Reverse******");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
				
	}

}
