package File;

import java.io.*;;

public class ReadingAndAccepting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the String:-");
		String s1=br.readLine();
		System.out.println(s1);
		System.out.println("Enter the number:-");
		String s2=br.readLine();
		int x=Integer.parseInt(s2);
		System.out.println("square="+(x*x));

	}

}
