package Assignment6;

import java.util.Scanner;

class Medicine
{
	void displayLabel()
	{
		String com,addr;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Company name and address:- ");
		com=sc.next();
		addr=sc.next();
		System.out.println("company:"+com+" "+"address:"+addr);
	}
}
class Tablet extends Medicine
{
	void displayLabel()
	{
		System.out.println("store in a cool dry place.");
	}
}
class Syrup extends Medicine
{
	void displayLabel()
	{
		System.out.println("Consumption as directed by the physician.");
	}
}
class Ointment extends Medicine
{
	void displayLabel()
	{
		System.out.println("for external use only.");
	}
}
public class ProgramSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medicine m[]=new Medicine[10];
		double i=Math.random()*4;
		int j=(int)i;
		System.out.println(j);
		
		switch(j)
		{
		case 1:m[0]=new Medicine();
			   m[1]=new Tablet();
			   m[0].displayLabel();
			   m[1].displayLabel();
			   break;
			   
		case 2:m[2]=new Medicine();
			   m[3]=new Syrup();
		       m[2].displayLabel();
		       m[3].displayLabel();
		        break;
		case 3:m[4]=new Medicine();
			   m[5]=new Ointment();
		       m[4].displayLabel();
		       m[5].displayLabel();
		       break;
		       
		       default:
		    	   System.out.println("Invalid Choice:-");
		}
	}

}
