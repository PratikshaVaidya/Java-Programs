/*2. Write a Java program to create a new array list, add some colors (string) and print 
out the collection(use iterator() and foreach() for printing elements).
*/

package Assignment13;

import java.util.*;

public class ProgramThird {

	public static void main(String[] args) {
		List l=new ArrayList();
		l.add("green");
		l.add("pink");
		l.add("Black");
		l.add("Grey");
		l.add("blue");
		System.out.println(l);
		ListIterator<String>li=l.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		Object o[]=l.toArray();
			for(Object i:o)
			{
			
				System.out.println(i);
			}
		

	}

}
