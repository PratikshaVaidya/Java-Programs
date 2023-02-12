package Assignment2;
import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int r,cubesum=0,num=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number which you want to check armstrong or not:-");
		int n=sc.nextInt();
		num=n;
		
		while(n>0)
		{
			r =n%10;
			cubesum=cubesum+(r*r*r);
			n=n/10;
		}
		if(num==cubesum)
		{
			System.out.println("an armstrong number");
		}
		else
		{
			System.out.println("not an armstrong number");
		}
	}

}
