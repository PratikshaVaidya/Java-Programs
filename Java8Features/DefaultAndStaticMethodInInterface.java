package Java8Features;
interface Three
{
	default void show()
	{
		System.out.println("In deafult show method");
	}
	static void display()
	{
	System.out.println("In static diaplay method");	
	}
}
public class DefaultAndStaticMethodInInterface implements Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Three t=new DefaultAndStaticMethodInInterface();
		t.show();
		Three.display();
		

	}

}
