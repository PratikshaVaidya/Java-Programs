/*8. Write a java program to read & write the content to and from “myFile.txt” using 
RandomAccessFile*/

package File;

import java.io.*;

class FileDemo1
{
	void WriteTo(String fn)throws IOException
	{
		RandomAccessFile raf=new RandomAccessFile(fn,"rw");
		
		String s="java is developed by james";
		raf.seek(raf.length());
		raf.write(s.getBytes());
		System.out.println("successfull");
		raf.close();
	}
	
	void readFromFile(String fn)throws IOException
	{
		RandomAccessFile raf=new RandomAccessFile(fn,"r");
		
		System.out.println("reading from file..");
		int i;
		while((i=raf.read())!=-1)
				{
					System.out.println((char)i);
				}
		raf.close();
	}
}
public class RandomAccefile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileDemo1 f=new FileDemo1();
		f.WriteTo("myFile");
		f.readFromFile("myFile");

	}

}
