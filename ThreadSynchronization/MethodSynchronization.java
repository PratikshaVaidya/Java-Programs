package ThreadSynchronization;
class TableDemo
{
	synchronized void show(int x)
	{
		for(int i=1;i<=10;i++)
		{
		try
		{
			Thread.sleep(500);
			System.out.println(i*x);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	 }
	}
}
class one extends Thread
{
	TableDemo t;
	one(TableDemo t)
	{
		this.t=t;
	}
	@Override
	public void run() {
		t.show(10);
	}
}
class Two extends Thread
{
	TableDemo t;
	Two(TableDemo t)
	{
		this.t=t;
	}
	@Override
	public void run() {
		t.show(8);
	}
}
public class MethodSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableDemo t1=new TableDemo();
		one o1=new one(t1);
		o1.start();
		Two t2=new Two(t1);
		t2.start();

	}

}
