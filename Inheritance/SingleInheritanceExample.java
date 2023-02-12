package Inheritance;
import java.util.*;
class Person
{
	String pnm,addr;
	void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Person Name and Address:-");
		pnm=sc.next();
		addr=sc.next();
		
	}
	
}
class Employe11 extends Person
{
	int id;
	float sal;
	void get1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id and salary:-");
		id=sc.nextInt();
		sal=sc.nextFloat();		
	}
	void put()
	{
		System.out.println("Id="+id+" "+"person name="+pnm+" "+"address= "+addr+" "+"Salary is="+sal);
	}
}
public class SingleInheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe11 e1=new Employe11();
		e1.get();
		e1.get1();
		e1.put();

	}

}
