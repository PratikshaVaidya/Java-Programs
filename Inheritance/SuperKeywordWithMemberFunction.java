package Inheritance;
class Base3
{
	int x=20;
	void show()
	{
		System.out.println("x="+x);
	}
}
class Derived3 extends Base3
{
	int x=23;
	void show()
	{
		super.show();
		System.out.println("x="+x);
	}
}
public class SuperKeywordWithMemberFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived3 d1=new Derived3();
		d1.show();
	}

}
