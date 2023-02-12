package ThreadSynchronization;

class Buffer
{
	int data;
	boolean status=false;
	synchronized void get(int data) throws InterruptedException
	{
		System.out.println("Document thread started...");
		if(status==true)
		{
			System.out.println("document goes into waiting...");
			wait();
		}
		this.data=data;
		System.out.println("Document added:-"+data);
		status=true;
		notify();
	}
	synchronized void put() throws InterruptedException
	{
		System.out.println("printer thread started...");
		if(status==false)
		{
			System.out.println("printer goes into waiting...");
			wait();
		}
		this.data=data;
		System.out.println("Document added:-"+data);
		status=false;
		notify();
	}
}
class Document extends Thread
{
	Buffer b;
	Document(Buffer b)
	{
		this.b=b;
	}
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			try
			{
				b.get(i);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}
class Printer extends Thread
{
	Buffer b;
	Printer(Buffer b)
	{
		this.b=b;
	}
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			try
			{
				b.put();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
public class InterThreadCommunication {

	public static void main(String[] args) {
		Buffer b=new Buffer();
		Document d=new Document(b);
		d.start();
		Printer p=new Printer(b);
		p.start();

	}

}
