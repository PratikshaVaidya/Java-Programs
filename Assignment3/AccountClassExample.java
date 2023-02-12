package Assignment3;
import java.util.*;
class Account
{
	int accno;
	String accname,addr;
	double balance;
	public Account() 
	{
		
		accno=1001;
		accname="sweety";
		addr="pune";
		balance=100;
	}
	public Account(int accno, String accname, String addr)
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
		return "Account [accno=" + accno + ", accname=" + accname + ", addr=" + addr + ", balance=" + balance + "]";
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
		if(amt>balance)
		{
			System.out.println("Insufficient Balance");
			System.out.println("account number :-"+accno+" "+"accountant name="+accname+" "+"address="+addr+" "+"balance="+balance);
		}
		else
		{
			balance=balance-amt;
			System.out.println("balance="+balance);
			System.out.println("account number :-"+accno+" "+"accountant name="+accname+" "+"address="+addr+" "+"balance="+balance);
		}
	}
}
public class AccountClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Account a=new Account();
		System.out.println(a);
		
		System.out.println("Enter the Account Number and name of user and address:-");
		int accno=sc.nextInt();
		String name=sc.next();
		String addr=sc.next();
		//float balance=sc.nextInt();
		Account a1=new Account(accno,name,addr);
		System.out.println(a1);
		//System.out.println(a);
		
	
		a1.Deposite();
		a1.Withdraw();

	}

}
