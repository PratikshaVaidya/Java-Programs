package ExceptionHandling;

import java.util.Scanner;

class Passout extends Exception
	{
	Passout(String msg)
		{
		super(msg);
		}
	}
public class PassoutExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the yera:-");
		int year=sc.nextInt();
		try
		{
			if(year!=2022)
			{
				throw new Passout("Passout year must be 2022....sorry you can not register");
			}
			else
			{
				System.out.println("register here...");
			}
		}
			catch(Passout p)
			{
				System.out.println(p);
			}
		
	}

}
