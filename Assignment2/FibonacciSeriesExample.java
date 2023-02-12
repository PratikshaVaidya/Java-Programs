package Assignment2;

import java.util.Scanner;

public class FibonacciSeriesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0,second=1,third,n=13;
		Scanner sc=new Scanner(System.in);
		//System.out.println("fibonaccie series upto :-");
		//n=sc.nextInt();
		//System.out.println(n1+" "+n2);
		while(first<=n)
		{
			System.out.println(+first);
			third=first+second;
			first=second;
			second=third;
			
		}
	}

}
