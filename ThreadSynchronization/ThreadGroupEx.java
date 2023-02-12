package ThreadSynchronization;
class MyThread22 extends Thread
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread()+" "+getName());
	}
}

public class ThreadGroupEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread22 m1=new MyThread22();
		MyThread22 m2=new MyThread22();
		MyThread22 m3=new MyThread22();
		
		ThreadGroup tg=new ThreadGroup("Parent");
		
		Thread t1=new Thread(tg,m1,"one");
		Thread t2=new Thread(tg,m2,"two");
		Thread t3=new Thread(tg,m3,"third");
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println(tg);
		
	}

}
