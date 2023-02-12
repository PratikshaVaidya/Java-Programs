/*1. Write a Java program to create Thread and practice below mehtods.
getName(): It is used for Obtaining a thread’s name 
getPriority(): Obtain a thread’s priority 
isAlive(): Determine if a thread is still running 
join(): Wait for a thread to terminate 
run(): Entry point for the thread 
sleep(): suspend a thread for a period of time 
start(): start a thread by calling its run() method*/
package Assignment14;
class MyThread34 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<=4;i++)
		{
			
		try
		{
			Thread.sleep(500);
			System.out.println("THis IS RUN METHOD()"+Thread.currentThread()+" "+getName()+" "+getPriority());
			}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		}
	}
}
public class ProgramFirst {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MyThread34 mt=new MyThread34();
		mt.setName("1");
		mt.setPriority(Thread.MAX_PRIORITY);
		mt.start();
		System.out.println(mt.isAlive());
		mt.join();
		
		MyThread34 mt1=new MyThread34();
		mt1.setName("2");
		mt1.setPriority(Thread.MIN_PRIORITY);
		mt1.start();
		System.out.println(mt1.isAlive());
		mt1.join();
		
		MyThread34 mt2=new MyThread34();
		mt2.setName("3");
		mt2.setPriority(Thread.NORM_PRIORITY);
		mt2.start();
		System.out.println(mt2.isAlive());

	}

}
