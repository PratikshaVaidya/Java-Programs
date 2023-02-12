package Assignment2;
import java.util.*;
public class PersonIsEligibleForVoting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:-");
		age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("You are Eligible for Voting!!!");
		}
		else
		{
			System.out.println("You are Not Eligible for Voting!!!");
		}
				

	}

}
