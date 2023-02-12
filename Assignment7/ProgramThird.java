package Assignment7;

			//First file that is Student.java

//. Create 2 classes Student and Batch, Student class is in pack1n and Batch class 
//is in pack2. Write a PrintData class to print Student and Batch information.

package ipackageexpl;
import java.util.*;
public class Student
{
	public int id;
	public String name;
	public float res;
	public void display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student id,name,result:-");
		id=sc.nextInt();
		name=sc.next();
		res=sc.nextFloat();
		//System.out.println("information of Student is="+id+" "+name+" "+res);
	}
}

		//Second file that is Batch.java

package abcd;
import ipackageexpl.Student;
import java.util.*;

public class Batch extends Student
{
	public int batchid;
	public  String batchname;

	public void printdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the batch id and name:-");
		batchid=sc.nextInt();
		batchname=sc.next();
		System.out.println("information of Student and batch is id="+id+" "+"name="+name+" "+"result="+res+" "+"batch id="+batchid+" "+"batch name="+batchname);
		//System.out.println()
	}
	public static void main(String args[])
	{
		Batch b1=new Batch();
		b1.display();
		b1.printdata();
	}
}


		//execution steps
1)javac -d .  Student.java

2)javac -d . Batch.java

3)java abcd.Batch
Enter the student id,name,result:-
11
sweety
89
Enter the batch id and name:-
200
first
information of Student and batch is id=11 name=sweety result=89.0 batch id=200 batch name=first

