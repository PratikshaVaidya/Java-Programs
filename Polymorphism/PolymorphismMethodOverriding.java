package Polymorphism;
class Shapee
{
	void draw()
	{
		System.out.println("In shape class draw()");
	}
}
class Circlee1 extends Shapee
{
	void draw()
	{
		System.out.println("In circle class draw()");
	}	
}
public class PolymorphismMethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circlee1 c1=new Circlee1();
		c1.draw();
	}

}
