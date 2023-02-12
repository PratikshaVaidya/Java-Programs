/*3. Java program to read content from one file and write it into another file.*/

package Assignment12;

import java.io.*;

public class ProgramThird {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s="";
		FileInputStream fis=new FileInputStream("MyFile.txt");
		String s1="Synchronization is perform on shared resourses ";
		int i;
		while((i=fis.read())!=-1)
		{
		s+=(char)i;
		}
		
		FileOutputStream fos=new FileOutputStream("MyFile2.txt");
		fos.write(s.getBytes());
		System.out.println("Successfully done !!!");
		fos.close();
	}

}
