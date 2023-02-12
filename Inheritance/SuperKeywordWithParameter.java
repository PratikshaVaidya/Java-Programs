package Inheritance;
class base1
{
	base1()
	{
		System.out.println("This is default constructor of base class:-");
	}
	base1(int x)
	{
		System.out.println("This is Parameterised constructor of base class:-");
	}
}
class Derived1 extends base1
{
	Derived1()
	{
		System.out.println("This is default constructor of Derived class:-");
	}
	Derived1(int y)
	{
		super(10);
		System.out.println("This is Parameterised constructor of Derived class:-");
	}
}
public class SuperKeywordWithParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived1 d1=new Derived1();
		Derived1 d2=new Derived1(23);
		
	}

}
