package Inheritance;
interface one
{
	final int x=10;
	public abstract void display();
}
interface two
{
	public abstract void show();
	
}
class Demo11 implements one,two
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("In show ().");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("In display ().");
	}
	
}


public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		one o=new Demo11();
		two t=new Demo11();
		o.display();
		t.show();
	}

}
