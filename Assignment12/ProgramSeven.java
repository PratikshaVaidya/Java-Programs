package Assignment12;
import java.io.*;
import java.util.*;
public class ProgramSeven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int count=0;
		//String s;
		String line;
		//File f1=new File("MyFile2.txt");
		FileReader fr=new FileReader("MyFile2.txt");
		//FileInputStream fis=new FileInputStream("MyFile2.txt");
		//InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader bfr=new BufferedReader(fr);
	//	Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the word to be searched:-");
		//String s1=bfr.readLine();
		//System.out.println(s1);
		//String wrd=sc.nextLine();
		//FileOutputStream fos=new FileOutputStream();
		while((line=bfr.readLine())!=null)
		{
			String word[]=line.split(" ");
			count=count+word.length;
		}
		System.out.println("Number of words present in given file:"+count);
		
		bfr.close();

	}

}
