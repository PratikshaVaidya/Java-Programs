package BasicProgram;
import java.util.*;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age :-\n");
		age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Your are Eligible For Voting!!!");
		}else

			{
				System.out.println("Your are not Eligible For Voting!!!");
			}
		

	}

}
