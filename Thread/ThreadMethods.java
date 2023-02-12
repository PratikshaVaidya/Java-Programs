package Thread;
class MyThread11 extends Thread
{
	@Override
	public void run() 
	{
		try
		{
			for(int i=0;i<=4;i++)
			{
				
			Thread.sleep(500);
		
		System.out.println("in run()"+Thread.currentThread()+" "+getName()+" "+getPriority());
		}
		}
		catch(InterruptedException e)
		{
			
		}
	}
}
public class ThreadMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread11 mt1=new MyThread11();
		mt1.setName("first");
		mt1.start();
		System.out.println(mt1.isAlive());
		//mt1.setPriority(MAX_PRIPRITY());
		mt1.setPriority(Thread.MAX_PRIORITY);
		//System.out.println();
		
		MyThread11 mt2=new MyThread11();
		mt2.setName("second");
		mt2.start();
		
		MyThread11 mt3=new MyThread11();
		mt3.setName("Third");
		mt3.start();
		
		
	}

	



	

}
