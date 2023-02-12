package Assignment3;
import java.util.*;
public class AdditionOfTwoArrayUsingThreeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[5];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st array:- ");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("Enter the 2st array:- ");
		for(i=0;i<5;i++)
		{
			b[i]=sc.nextInt();
			
		}
		for(i=0;i<5;i++)
		{
			
				c[i]=a[i]+b[i];
			System.out.println(c[i]);
			}
		}
	}


