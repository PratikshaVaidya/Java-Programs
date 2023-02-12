package BasicProgram;

import java.util.*;
import java.io.*;

 class DifferentDataTypeValues {

	public static void main(String args[]) throws IOException
	{
		// TODO Auto-generated method stub
		int a;
		char c;
		float b;
		double d;
		String s;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the int,char,float,double and string value:-\n");
		a=sc.nextInt();
		c=(char)System.in.read();
		b=sc.nextFloat();
		d=sc.nextDouble();
		s=sc.next();
		System.out.println(a+ "" +c+"" +b+"" +d+"" +s);
	
		

	}

}
