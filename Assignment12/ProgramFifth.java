/*5. Write a java program that takes a file name and a search string from the user, if 
the search string occures in the file, then it counts the no. Of occurences of the 
string
Ex: output :Enter a file name : test.txt
Enter a word : you*/

package Assignment12;
import java.io.*;
import java.util.*;
public class ProgramFifth {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int count=0;
		String s;
		String[] buffer;
		File f1=new File("MyFile2.txt");
		FileReader fr=new FileReader(f1);
		//FileInputStream fis=new FileInputStream("MyFile2.txt");
		//InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader bfr=new BufferedReader(fr);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word to be searched:-");
		//String s1=bfr.readLine();
		//System.out.println(s1);
		String wrd=sc.nextLine();
		//FileOutputStream fos=new FileOutputStream();
		while((s=bfr.readLine())!=null)
		{
			buffer=s.split(" ");
			for(String chr:buffer)
			{
				if(chr.equals(wrd))
				{
					count++;
				}
			}
		}
		if(count==0)
		{
			System.out.println("word not found");
		}
		else
		{
			System.out.println("Word:"+wrd+" Found Count:"+count);
		}
		
		fr.close();

	}

}
