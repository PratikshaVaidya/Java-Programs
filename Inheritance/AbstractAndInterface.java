package Inheritance;

interface three
{
	default void show()
	{
		System.out.println("In show()");
	}
	static void display()
	{
		System.out.println("In display()");
	}
}
public class AbstractAndInterface implements three
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		three t=new AbstractAndInterface();
		t.show();
		three.display();

	}

}
