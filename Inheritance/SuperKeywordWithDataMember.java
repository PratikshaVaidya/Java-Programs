package Inheritance;
class Base2
{
int x=12;	
}
class Derived2 extends Base2
{
	int x=25;
	void show()
	{
		System.out.println("x= "+this.x);
		System.out.println("x= "+super.x);
	}
}

public class SuperKeywordWithDataMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived2 d1=new Derived2();
		d1.show();
	}

}
