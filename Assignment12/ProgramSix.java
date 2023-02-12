/*6. Write a java program to read console data using BufferedReader API*/

package Assignment12;


import java.io.*;

public class ProgramSix {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr); 
		PrintWriter pw=new PrintWriter(System.out);
		System.out.println("Enter the String :-");
		String s1=br.readLine();
		pw.write(s1);
		pw.flush();
		
		System.out.println("Enter the integer number:-");
		String s2=br.readLine();
		int i=Integer.parseInt(s2);
		pw.print(i);
		pw.flush();
		
		System.out.println("Enter the double number:-");
		String s4=br.readLine();
		
		double d1=Double.parseDouble(s4);
		pw.print((int) d1);
		pw.flush();
		
		System.out.println("Enter the char:-");
		String s3=br.readLine();
		pw.print(s3);
		pw.flush();
		
		System.out.println("Enter the float number:-");
		String s5=br.readLine();
		float f1=Float.parseFloat(s5);
		pw.print(f1);
		pw.flush();

	}

}
