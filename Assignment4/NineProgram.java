/*Accept Integer values from user and display it’s equivalent Binary, Hexadecimal, 
Octal values*/
package Assignment4;

import java.util.Scanner;

public class NineProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for performing Binary,Hexadecimal,octal operation ");
		int num=sc.nextInt();
		String Hexa=Integer.toHexString(num);
		System.out.println("Hexadecimal number is:-"+Hexa);
		String Binary=Integer.toBinaryString(num);
		System.out.println("Binary number is:-"+Binary);
		String octal=Integer.toOctalString(num);
		System.out.println("octal number is:-"+octal);*/
		
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the number for performing Binary,Hexadecimal,octal operation ");
		int num=sc.nextInt();
		System.out.println("which operation you want ton perform:-");
		System.out.println("1)hexadecimal\n 2)Binary\n 3)Octal\n");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			String Hexa=Integer.toHexString(num);
			System.out.println("Hexadecimal number is:-"+Hexa);
			break;
		case 2:
			String Binary=Integer.toBinaryString(num);
			System.out.println("Binary number is:-"+Binary);
			break;
		case 3:
			String octal=Integer.toOctalString(num);
			System.out.println("octal number is:-"+octal);
			break;
			
			
			default:
				System.out.println("Enter correct choice:-");
				
			
		}
		
	}

}
