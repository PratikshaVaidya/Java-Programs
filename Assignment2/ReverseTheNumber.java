package Assignment2;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,rev=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number which you want to reverse:-");
		n=sc.nextInt();
		while(n!=0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		System.out.println("reverse number is:-"+rev);
	}

}
