/*3.Write a Menu Driven program to do following 
To Add elements into Arraylist
To retrieve an element (at a specified index) from a given array list
Toinsert an element into the array list at the first position
To update specific array element by given element.
To remove element from given position
To Search element in an arraylist
To reverse element of an arraylist
To sort element of an arraylist*/

package Assignment13;

import java.util.*;

public class ProgramFourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1=new ArrayList();
		l1.add("Pratiksha");
		l1.add("Sweety");
		l1.add("priyanaka");
		l1.add("mandakini");
		l1.add("pallavi");
		System.out.println(l1);
	//System.out.println(l1.set(0, l1));//To retrieve an element (at a specified index) from a given array list
		//System.out.println(l1.get((int) 79.88f));
	l1.remove("pallavi");
	System.out.println(l1);
	ListIterator<String>li=l1.listIterator();
	System.out.println("***REVERSE***");
	while(li.hasPrevious())
	{
		System.out.println(li.previous());
	}

	}

}
