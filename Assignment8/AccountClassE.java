package Assignment8;
import java.util.*;

class InsufficientFundsException extends Exception
{
	InsufficientFundsException(String msg)
	{
		super(msg);
	}
}


class Account11
{
	int accno;
	String accname,addr;
	double balance;
	public Account11() 
	{
		
		accno=1001;
		accname="sweety";
		addr="pune";
		balance=100;
	}
	public Account11(int accno, String accname, String addr)
	{
		super();
		this.accno = accno;
		this.accname = accname;
		this.addr = addr;
		//this.balance=balance;
	}
	@Override
	public String toString() 
	{
		return "Account11 [accno=" + accno + ", accname=" + accname + ", addr=" + addr + ", balance=" + balance + "]";
	}
	void Deposite()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount for deposite:- ");
		int amt=sc.nextInt();
		balance=balance+amt;
		System.out.println("Balance is:-"+balance);
	}
	void Withdraw()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount for withdraw:- ");
		int amt=sc.nextInt();
		try
		{
			if(amt>balance)
		{
			throw new InsufficientFundsException("Insufficient Balance");
			//System.out.println("account number :-"+accno+" "+"accountant name="+accname+" "+"address="+addr+" "+"balance="+balance);
		}
		else
		{
			balance=balance-amt;
			System.out.println("balance="+balance);
			System.out.println("account number :-"+accno+" "+"accountant name="+accname+" "+"address="+addr+" "+"balance="+balance);
		}
		}
			catch(InsufficientFundsException ie)
			{
				System.out.println(ie);
			}
	}
}
public class AccountClassE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Account11 a=new Account11();
		System.out.println(a);
		
		System.out.println("Enter the Account Number and name of user and address:-");
		int accno=sc.nextInt();
		String name=sc.next();
		String addr=sc.next();
		//float balance=sc.nextInt();
		Account11 a1=new Account11(accno,name,addr);
		System.out.println(a1);
		//System.out.println(a);
		
	
		a1.Deposite();
		a1.Withdraw();

	}

}
