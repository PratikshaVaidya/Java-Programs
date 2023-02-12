package File;


import java.io.*;

public class OutputStreamClass {

	public static void main(String[] args) throws IOException {
	//writing into file
		FileOutputStream fos=new FileOutputStream("f5.txt");
		String s="writing into file ......";
		fos.write(s.getBytes());
		System.out.println("sucessfully.....");
		fos.close();
		
		//reading from file
		FileInputStream fis=new FileInputStream("f5.txt");
		System.out.println("reading from file.....");
		int i;
		while((i=fis.read())!=-1)
			{
			System.out.println((char)i);
			}
		
		

	}

}
