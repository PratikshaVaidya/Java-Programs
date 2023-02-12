package ThreadSynchronization;

import java.util.*;

class BankAppDemo extends Thread
{
	static int bal;
	void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the balance");
		bal=sc.nextInt();		
	}
	static synchronized void withdraw(int amt)
	{
		System.out.println(Thread.currentThread()+"is accessing");
		if(bal<amt)
		{
			System.out.println("Insufficient Balance");
		}else
		{
			bal=bal-amt;
			if(bal<5000)
			{
				System.out.println("minimum balance in account must be Rs.5000"+Thread.currentThread());
			}
			else
			{
				System.out.println("Transaction successfully by the "+Thread.currentThread()+"balance is"+bal);
			}
		}
	}
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			try 
			{
			Thread.sleep(500);
			withdraw(2500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
public class StaticSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAppDemo b1=new BankAppDemo();
		b1.setName("sweety");
		b1.get();
		b1.start();
		
		BankAppDemo b2=new BankAppDemo();
		b2.setName("pratiksha");
		
		b2.start();

	}

}
