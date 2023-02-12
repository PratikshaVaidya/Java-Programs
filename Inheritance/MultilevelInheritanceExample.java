package Inheritance;
import java.util.*;
class Hospital
{
String hnm,hadd;
	void get1()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the hospital name and hospital address:-");
	hnm=sc.next();
	hadd=sc.next();
	
	}
	void put1()
	{
		System.out.println("Hospital Name= "+hnm+" "+"Hospital Address= "+hadd);
	}
}
class Patient extends Hospital
{
	int pid,wordno;
	String pnm;
	void get2()
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the person id  and person name,wordno:-");
	pid=sc.nextInt();
	pnm=sc.next();
	wordno=sc.nextInt();
	}
	void put2()
	{
		System.out.println("person id= "+pid+" "+"person name="+pnm+" "+"word no="+wordno);
	}
}
class Bill extends Patient
{
	int bid,bamt;
	void get3()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the bill id and amount:-");
		bid=sc.nextInt();
		bamt=sc.nextInt();
		
	}
	void put3()
	{
		System.out.println("bill id= "+bid+" "+"bill amount= "+bamt);	
	}
}
public class MultilevelInheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bill b1=new Bill();
		b1.get1();
		b1.get2();
		b1.get3();
		b1.put1();
		b1.put2();
		b1.put3();
	}

}
