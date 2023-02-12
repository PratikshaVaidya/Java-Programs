/*Write a JAVA program which will generate the threads:
- To display 10 terms of Fibonacci series. (class Fibonacci extends Thread)
- To display 1 to 10 in reverse order. (class Reverse extends Thread)
*/

package Assignment14;

import java.util.*;

class Fibonacci extends Thread
{
	@Override
	public void run() 
	{
		int first=0,second=1,third=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit for Fibonaccie");
		n=sc.nextInt();
		//System.out.println(first+" "+second);
		
		while(n>0)
		{
			System.out.println(+first);
			/*third=first+second;
			first=second;
			second=third;*/
			first=second;
			second=third;
			third=first+second;
			n=n-1;
			
		}
		
		
	}
}

class Reverse extends Thread
{
@Override
public void run()
{
	//int n1,rev=0,rem;
	int n1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number for reverse:-");
	n1=sc.nextInt();
	/*while(n1!=0)
	{
		rem=n1%10;
		rev=(rev*10)+rem;
		n1=n1/10;
	}*/
	for(int i=n1;i>=1;i--)
	{
	System.out.println(i);
	}
	
}	
}

public class ProgramFourth {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Fibonacci f1=new Fibonacci();
		f1.start();
		f1.join();
		Reverse r1=new Reverse();
		r1.start();
		

	}

}
