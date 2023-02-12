package ExceptionHandling;

import java.util.Scanner;

class Excep
{
	int x,y;
	void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 2 numbers:-");
		x=sc.nextInt();
		y=sc.nextInt();
	}
	void display()
	{
		try
		{
			if(y==0)
			{
				throw new ArithmeticException();
			}
			else if(x<y)
			{
				throw new Exception();
			}
			else
			{
				System.out.println("Division="+(x/y));
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Divide by zero is not possible:-");
		}
		catch(Exception e)
		{
			System.out.println("first number issmaller then the second number:-");
		}
		finally
		{
			System.out.println("thank you");
		}
		System.out.println("Addition is:-"+(x+y));
		System.out.println("substraction is:-"+(x-y));
		System.out.println("multiplication is:-"+(x*y));
	}
}
public class ArithmaticExc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Excep ex=new Excep();
		ex.get();
		ex.display();

	}

}
