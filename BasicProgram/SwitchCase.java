package BasicProgram;

import java.io.*;
import java.util.*;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		int x,y;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("This is Program For Calculation:-\n");
		System.out.println("\n1.Addition \n2.Substraction \n3.Multiplication \n4.Division");
		ch=sc.nextInt();
		System.out.println("Enter the two numbers");
		x=sc.nextInt();
		y=sc.nextInt();
		switch(ch)
		{
			case 1:
				//System.out.println("Enter the two numbers");
				System.out.println("Addition of two digits is:-"+(x+y));
				break;
			case 2:
				//System.out.println("Enter the two numbers");
				System.out.println("Substraction of two digits is:-"+(x-y));
				break;
			case 3:
				//System.out.println("Enter the two numbers");
				System.out.println("Multiplication of two digits is:-"+(x*y));
				break;
			case 4:
				//System.out.println("Enter the two numbers");
				System.out.println("Division of two digits is:-"+(x/y));
				break;
			default:
				System.out.println("Invalid Choice:-");
				
		}
		

	}

}
