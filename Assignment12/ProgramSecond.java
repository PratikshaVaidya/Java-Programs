/*2. Write a java program to read & write the content to and from “myFile.txt” using 
FileInputStream and FileOutputStream API*/

package Assignment12;

import java.io.*;

public class ProgramSecond {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//writing into the file
		FileOutputStream fos=new FileOutputStream("myFile.txt");
		String s="Writing into the file !";
		fos.write(s.getBytes());
		System.out.println("successfully writen the data!");
		
		//reading from the file
		FileInputStream fis=new FileInputStream("myFile.txt");
		String s1="Reading from the file!!";
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.println((char)i);
		}
		
		

	}

}
