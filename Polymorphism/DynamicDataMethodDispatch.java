package Polymorphism;
class Shape
{
	void draw()
	{
	System.out.println("This is draw method of shape class:-");
	}
}
class Circle extends Shape
{
	void draw()
	{
	System.out.println("This is draw method of circle class:-");
	}
}

public class DynamicDataMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c1=new Circle();
		c1.draw();

	}

}
