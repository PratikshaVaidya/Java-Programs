package ExceptionHandling;

import java.io.IOException;

public class SleepExa {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
System.out.println("Enter the character:-");
char ch=(char)System.in.read();
Thread.sleep(2000);
System.out.println("Character= "+ch);

	}

}
