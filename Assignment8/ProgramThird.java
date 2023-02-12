/*Create a class Number having the following features:(use throw keyword)
Attributes
int first number
48
Lab Manual
int second number
result double stores result of math operations performed 
on a & b
Member functions(Methods)
Number(x, y) constructor to initialize the values of a and b
add() stores the sum of a and b in result
sub() stores difference of a and b in result
mul() stores product in result
div() stores a divided by b in result
Test to see if b is 0 and throw an appropriate exception since division by zero is 
undefined.
Display a menu to the user to perform the above four arithmetic operations.
*/
package Assignment8;

import java.util.*;

class Number
{
	int x,y;
	int result;
	Number(int a,int b)
	{
		x=a;
		y=b;
	}
	void div()
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two number:-");*/
		try
		{
			if(y==0)
				{
					throw new ArithmeticException();
				}
			else if(x<y)
				{
			       throw new Exception();
				}
			else
				{
				result=x/y;
				System.out.println("division="+(result));
				}
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Divide by zero is not possible");
		}
		catch(Exception e)
		{
			System.out.println("first number is smaller then the second number");
		}
		/*finally
		{
			
			System.out.println("substraction="+(x-y));
			System.out.println("Multiplication="+(x*y));
		}*/
		
			
	}
	void add()
	{
		result=x+y;
		System.out.println("Addition="+result);
	}
	void sub()
	{
		result=x-y;
		System.out.println("substraction="+result);
	}
	void mul()
	{
		result=x*y;
		System.out.println("multiplication="+result);
	}
	
}
public class ProgramThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Number n1=new Number(10,10);
		n1.div();
		n1.add();
		n1.sub();
		n1.mul();

	}

}
