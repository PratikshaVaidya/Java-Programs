package Assignment3;
import java.util.*;
class Stack
{
	int i,n;
	int arr[]=new int[5];
	Scanner sc=new Scanner(System.in);
	void push()
	{
		
		System.out.println("Enter the elements in stack:-");
		//n=sc.nextInt();
		for(i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	void pop()
	{
		System.out.println("Your array is:-");
		for(i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
public class StackClassUsingPushPop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s1=new Stack();
		s1.push();
		s1.pop();

	}

}
