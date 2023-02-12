package Assignment4;

import java.util.Scanner;

class Employe
{
	int id;
	String name;
	float sal;
	
	void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id,name and salary:-");
		id=sc.nextInt();
		name=sc.next();
		sal=sc.nextFloat();
		
	}
	void put()
	{
		System.out.println("id= "+id+" "+"name= "+name+" "+"salary="+sal);
	}
}
public class SecondProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Employe e1[]=new Employe[5];
		for(i=0;i<5;i++)
		{
			e1[i]=new Employe();
			e1[i].get();
			//e1[i].put();
			
		}
		for(i=0;i<5;i++)
		{
			//e1[i]=new Employe();
			//e1[i].get();
			e1[i].put();
			
		}

	}

}
