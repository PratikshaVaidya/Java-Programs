package Inheritance;
abstract class ADemo
{
	int x=10;
	ADemo()
	{
		x=25;
	}
	void display()
	{
		System.out.println("In display().");
	}
	public abstract void show();
}
class Demo extends ADemo
{

	@Override
	public void show()
	{
		// TODO Auto-generated method stub
		System.out.println("In show().");
	}
	
}
public class AbstractClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1=new Demo();
		d1.show();
		d1.display();
	}

}
