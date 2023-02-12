/*2. Write a Java program to create multiple threads using Runnabel interface and print 
currently running thread.
*/

package Assignment14;
class MyThread122 implements Runnable
{

	@Override
	public void run()
	{

	System.out.println("This is method()"+Thread.currentThread());	
	}
	
}
public class ProgramSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread122 mt=new MyThread122();
		Thread t=new Thread(mt);
		t.setName("one");
		t.start();
		
		MyThread122 mt1=new MyThread122();
		Thread t1=new Thread(mt);
		t1.setName("two");
		t1.start();
		
		MyThread122 mt2=new MyThread122();
		Thread t2=new Thread(mt);
		t2.setName("Three");
		t2.start();

	}

}
