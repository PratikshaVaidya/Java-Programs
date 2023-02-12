package Multithreading;
class MyThread22 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("In run()");
		
	}
	
}
public class ByImplementingRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread22 mt=new MyThread22();
		Thread t=new Thread(mt);
		t.start();
		
	}

}
