package Assignment2;
import java.util.*;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:-");
		n=sc.nextInt();
		while(n>0)
		{
		fact=fact*n;
		n--;
				}
		System.out.println("Factorial number is:-"+fact);
		
	}


}
