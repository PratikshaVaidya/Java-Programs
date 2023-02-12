/*3. Write a program that creates 2 threads (Thread1,Thread2)- each displaying a 
message (Pass the message as a parameter to the constructor). The threads should 
display the messages continuously till the user presses ctrl+c. (use Thread.sleep(400))*/

package Assignment14;
class MyThread00 extends Thread
{
	String msg="";
	MyThread00(String msg)
	{
		this.msg=msg;
	}
	@Override
	public void run()
	{
		try {
		while(true){
			System.out.println(msg);
			Thread.sleep(400);
		} 
		}
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
public class ProgramThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread00 mt=new MyThread00("Running Thread......");
		mt.start();
		MyThread00 mt1=new MyThread00("Running Thread.....");
		mt1.start();

	}

}
