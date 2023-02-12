/*2. Create a class called CalcAverage that has the following method:(use throw 
keyword)
public double avgFirstN(int N)
This method receives an integer as a parameter and calculates the average of first
N natural numbers. If N is not a natural number, throw an exception 
IllegalArgumentException with an appropriate message.*/

package Assignment8;

import java.util.Scanner;

class CalcAverage
{
	int avg;
	public double avgFirstN(int n)
	{
		int sum=0;
		
		try
		{
			if(n<=0)
			{
				throw new IllegalArgumentException();
			}
			else
			{
				for(int i=0;i<=n;i++)
				{
					sum=sum+i;
				}
				System.out.println("sum="+sum);
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Given number is nutural number!");
		}
		return 0;
	}
	
	
}
public class ProgramTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcAverage c1=new CalcAverage();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:-");
		int n=sc.nextInt();
		c1.avgFirstN(n);

	}

}
