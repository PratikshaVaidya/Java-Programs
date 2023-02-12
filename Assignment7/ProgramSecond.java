/*Create an interface
interface MyMath
{
 double sqr(double a);
 double cube(double a);
 double cosine(double a);
 double sine(double a);
}
40
Lab Manual
Write a class implMath which implements MyMath interface.
Write another class MathDemo ..In main create a reference of MyMath pointing 
to implMath class and invoke the methods..Accept the values from the user*/

package Assignment7;

import java.util.Scanner;
//import java.util.Math;

abstract interface MyMath
{
	public abstract double sqr(double a);
	public abstract  double cube(double a);
	public abstract double cosine(double a);
	public abstract double sine(double a);
}
class implMath implements MyMath
{
	double a;
	

	public implMath(double a) {
		super();
		this.a = a;
	}

	@Override
	public double sqr(double a) 
	{
		// TODO Auto-generated method stub
		System.out.println("square ="+(a*a));
		return 0;
	}

	@Override
	public double cube(double a) {
		// TODO Auto-generated method stub
		System.out.println("cube ="+(a*a*a));
		return 0;
	}

	//@Override
	public double cosine(double a) {
		// TODO Auto-generated method stub
		System.out.println("cosine="+(Math.cos(a)));
		return 0;
	}

	@Override
	public double sine(double a) {
		// TODO Auto-generated method stub
		System.out.println("sine="+(Math.sin(a)));
		return 0;
	}
	
}

public class ProgramSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A:-");
		double a=sc.nextDouble();
		MyMath im=new implMath(a);
		im.sqr(a);
		im.cube(a);
		im.cosine(a);
		im.sine(a);
		

	}

}
