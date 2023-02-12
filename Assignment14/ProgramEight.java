/*Create a Banking Application simulating concurrent deposit and withdrawal. Use 
synchronized method for transaction. 
Account Class
 Attributes: acno & balance
Methods: getter setter methods and toString() 
 Method signature
 public synchronized int withdraw(Account acc, int amount)
{….}
public synchronized int deposit(Account acc, int amount)
{…..}
*/

package Assignment14;

import java.util.*;

class AccountEx 
{
	int acno,balance;

	public int getAcno() {
		return acno;
	}

	public void setAcno(int acno) {
		this.acno = acno;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "AccountEx [acno=" + acno + ", balance=" + balance + "]";
	}
	
	synchronized int deposit(Account acc,int amount)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		amount=sc.nextInt();
		try
		{
			if(amount>balance)
			{
				throw new
			}
		}
	}
}
public class ProgramEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
