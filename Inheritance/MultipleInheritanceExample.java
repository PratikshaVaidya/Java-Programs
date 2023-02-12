package Inheritance;
import java.util.*;
class Vehical
{
	int mno;
	String mnm;
	void get1()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the model number and model name:-");
	mno=sc.nextInt();
	mnm=sc.next();
	}
	void put1()
	{
	System.out.println("model no="+mno+" "+"model name= "+mnm);
	
	}
}
class Two_Wheeler extends Vehical
{
String tech1;
void get2()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the technology  name used for two wheelers:-");
	tech1=sc.next();
}
void put2()
{
System.out.println("technology name= "+tech1);

}
}
class Four_Wheeler extends Vehical
{
	String tech2;
	void get3()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the technology  name used for four wheelers:-");
		tech2=sc.next();
	}
	void put3()
	{
	System.out.println("technology name= "+tech2);

	}	
}
public class MultipleInheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two_Wheeler t=new Two_Wheeler();
		t.get1();
		t.put1();
		t.get2();
		t.put2();
		Four_Wheeler f=new Four_Wheeler();
		f.get1();
		f.put1();
		f.get3();
		f.put3();
	}

}
