package Inheritance;
class Base
{
	Base()
	{
		System.out.println("This is base class constructor:-");
	}
	
}
class Derived extends Base
{
	Derived()
	{
		//By default super() keyword is used
		System.out.println("This is Derived class constructor:-");
	}
	
}

public class SuperKeywordWithNoParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived d1=new Derived();

	}

}
