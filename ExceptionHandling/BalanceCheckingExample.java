package ExceptionHandling;

import java.util.Scanner;

class Balance extends Exception
{
	Balance(String msg)
	{
		super(msg);
	}
}
public class BalanceCheckingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the amount:-");
    int amt=sc.nextInt();
    try
    {
    	if(amt<=5000)
    	{
    		
    		throw new Balance("minimum balance should be 5000");
    	}
    	else
    	{
    		System.out.println("You can withdraw amount!!!");
    	}
    }
    	catch(Balance b)
    	{
    		System.out.println(b);
    	}
    finally
    {
    System.out.println("Thank you so much for your coming in this ATM!!!!!!!!!");	
    }
    }
    }


