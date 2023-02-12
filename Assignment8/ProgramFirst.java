package Assignment8;
import java.util.*;

class NumberFormatException extends Exception
{
	int n;
	public void NumberFormatException() throws NumberFormatException
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter any valid integer:");
		try
		{
			n=Integer.parseInt(sc.next());
			System.out.println("valid number:"+n);
			break;
		}
		
		catch( NumberFormatException e)
		{
			System.out.println("Invalid number");
		}
	}
}

class ArithmeticException_Demo
{
	public void Arithmatic()
	{
		try
		{
			int a=30,b=0;
			int c=a/b;
			System.out.println("Result="+c);
		}
		catch(ArithmeticException e)
		{
		System.out.println("can't divide a number by 0");	
		}
	}
}
class ArrayIndexOutOfBound_Demo
{
	public void ArrayIndexOutOfBound()
	{
		try
		{
			int a[]=new int[5];
			a[6]=9;
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index is out of Bounds");
		}
	}
}
class NullPointer_Demo

{
	public void nullPointer()
	{
		try
		{
			String a=null;
			System.out.println(a.charAt(0));
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception");
		}
	}
}
public class ProgramFirst {

	public static void main(String[] args)throws NumberFormatException
	{
		NumberFormatException nfe=new NumberFormatException();
		nfe.NumberFormatException();
		ArithmeticException_Demo ae=new ArithmeticException_Demo();
		ae.Arithmatic();
		ArrayIndexOutOfBound_Demo aib=new ArrayIndexOutOfBound_Demo();
		aib.ArrayIndexOutOfBound();
		NullPointer_Demo np=new NullPointer_Demo();
		np.nullPointer();
		
	}

}
