package ThreadSynchronization;

class TableDemo1
{
	void show(int x)
	{
		synchronized(this)
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
}
class one1 extends Thread
{
	TableDemo1 t;
	one1(TableDemo1 t)
	{
		this.t=t;
	}
	@Override
	public void run() {
		t.show(5);
	}
}
class Two1 extends Thread
{
	TableDemo1 t;
	Two1(TableDemo1 t)
	{
		this.t=t;
	}
	@Override
	public void run() {
		t.show(6);
	}
}
public class BlockSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    TableDemo1  t=new TableDemo1();
    one1 o1=new one1(t);
    o1.start();
    Two1 t1=new Two1(t);
    t1.start();

	}

}
