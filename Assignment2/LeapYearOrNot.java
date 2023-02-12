package Assignment2;
import java.util.*;
public class LeapYearOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year:-");
		year=sc.nextInt();
		if(year%4==0)
		{
			System.out.println("This is a leap year!");	
		}
		else
		{
			System.out.println("This is a Not  leap year");	
		}
		}

}
