package File;
import java.io.*;

public class MultipleFileUsingByteArrayOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos1=new FileOutputStream("f6.txt");
		FileOutputStream fos2=new FileOutputStream("f7.txt");
		
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		
		//writing into the file
		String s="Writing into the multiple file....";
		baos.write(s.getBytes());
		baos.writeTo(fos1);
		baos.writeTo(fos2);
		System.out.println("Success....");
		baos.close();
		
		
		//reading from the file
		FileInputStream fis1=new FileInputStream("f6.txt");
		FileInputStream fis2=new FileInputStream("f7.txt");
		SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
		System.out.println("reading from file......");
		int i;
		while((i=sis.read())!=-1)
		{
			System.out.println((char)i);
		}
	}

}
