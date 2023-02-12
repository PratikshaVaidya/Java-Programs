package Multithreading;
class MyThread1 extends Thread
{
	@Override
	public void run() {
		System.out.println("in run()");
	}
}
public class ByExtendingThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   MyThread1 mt=new MyThread1();
   mt.start();
   //System.out.println(mt);
	}

}
